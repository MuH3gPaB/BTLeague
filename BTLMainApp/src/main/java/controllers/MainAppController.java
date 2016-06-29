package controllers;

import config.PlayerEntityFields;
import instruments.EntityFactory;
import instruments.PlayerComparator;
import model.Player;
import org.hibernate.annotations.SourceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import repository.PlayersRepository;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

@Controller
public class MainAppController {

    @Autowired
    PlayersRepository playersRepository;

    @RequestMapping(value = "/")
    public ModelAndView index(){
        return new ModelAndView("index");
    }

    @RequestMapping(value = {"/players"})
    public ModelAndView playersList(){
        ArrayList players = (ArrayList) playersRepository.findAll();
        players.sort(new PlayerComparator());
        if(players.isEmpty()) return new ModelAndView("noplayers");
        ModelAndView modelAndView = new ModelAndView("players");
        modelAndView.addObject("players", players);
        return modelAndView;
    }

    @RequestMapping(value = "/createplayer")
    public ModelAndView goToAddForm(){
        return new ModelAndView("editplayer");
    }

    @Transactional
    @RequestMapping(value = "/editplayer")
    private ModelAndView editPlayer(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView("editplayer");
        return modelAndView;
    }

    @Transactional
    @RequestMapping(value = "/saveplayer")
    @ResponseBody
    private String savePlayer(HttpServletRequest request){
        // TODO: Здесь, когда будут разные классы игроков нужно будет установить определение конкретного класса
        Map<String, String> fields = new HashMap<>();
        for (int i = 0; i < PlayerEntityFields.fields.length; i++) {
            fields.put(PlayerEntityFields.fieldsNames[i], request.getParameter(String.valueOf(i)));
        }

        Player player = (Player) EntityFactory.createPlayer(fields, Player.class);

        if(request.getSession().getAttribute("id") != null){
            player.setPlayer_ID((Long) request.getSession().getAttribute("id"));
        }
        else
        {
            // Тут код, проверки наличия игрока в базе по значениям.
            if(checkExistByRepository(fields)){
             // А тут что делать, если запись уже есть в базе
            }
        }
        playersRepository.save(player);
        return "Player added/updated";
    }

    @Transactional
    @RequestMapping(value = "/deleteplayer")
    private ModelAndView deletePlayer(HttpServletRequest request) {
        playersRepository.delete((Long) request.getSession().getAttribute("id"));
        return playersList();
    }

    @RequestMapping(value = "/showplayer")
    public ModelAndView showPlayer(@RequestParam(name = "id") long player_id,
                                    HttpServletRequest request){
        Object obj = playersRepository.findOne(player_id);
        Map<String, String> result;

        try {
            result = (Map<String, String>) obj.getClass().getMethod("getNotEmptyFieldsAsMap").invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            result = new HashMap<>();
        }

        ModelAndView modelAndView = new ModelAndView("player");
        request.getSession().setAttribute("id", player_id);
        request.getSession().setAttribute("playerFields", result);
        return modelAndView;
    }

    @RequestMapping(value = "/checkexist", method = RequestMethod.GET)
    @ResponseBody
    public String checkExist(HttpServletRequest request){
        Map<String, String> fields = new HashMap<>();
        for (int i = 0; i < PlayerEntityFields.fields.length; i++) {
            fields.put(PlayerEntityFields.fieldsNames[i], request.getParameter(String.valueOf(i)));
        }
        return String.valueOf(checkExistByRepository(fields));
    }

    private boolean checkExistByRepository(Map<String, String> fields){
        return playersRepository.getByFirstNameAndLastName(fields.get("firstName"), fields.get("lastName")) != null;
    }
}
