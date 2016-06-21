package controllers;

import config.PlayerEntityFields;
import javafx.scene.control.RadioMenuItem;
import model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import repository.PlayersRepository;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

@Controller
public class MainAppController {

    @Autowired
    PlayersRepository playersRepository;

//    @RequestMapping(value = "/")
//    public ModelAndView index(){
//        return new ModelAndView("index");
//    }

    @RequestMapping(value = {"/players", "/"})
    public ModelAndView playersList(){
        ArrayList players = (ArrayList) playersRepository.findAll();
        if(players.isEmpty()) return new ModelAndView("noplayers");
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("players", players);
        return modelAndView;
    }

    @RequestMapping(value = "/addplayer")
    public ModelAndView goToAddForm(){
        return new ModelAndView("editplayer");
    }

    @Transactional
    @RequestMapping(value = "/editplayer")
    private ModelAndView editPlayer(@RequestParam(name = "name") String name,
                                    @RequestParam(name = "surname") String surname) {
        Player pl = new Player();
        pl.setFirstName(name);
        pl.setLastName(surname);
        playersRepository.save(pl);
        return this.playersList();
    }

    @Transactional
    @RequestMapping(value = "/deleteplayer")
    private ModelAndView deletePlayer(@RequestParam(name = "radio") RadioMenuItem radio) {
        System.out.println(radio);
        return this.playersList();
    }

    @RequestMapping(value = "/showplayer")
    public ModelAndView showPlayer(@RequestParam(name = "id") long player_id){
        Map<String, String> result = new HashMap<>();
        Object obj = playersRepository.findOne(player_id);
            for (int i = 0; i < PlayerEntityFields.fields.length; i++) {
                String fieldValue;
                String fieldName = PlayerEntityFields.fields[i];
                try {
                    fieldValue = obj.getClass()
                            .getMethod(PlayerEntityFields.getters[i])
                            .invoke(obj, null)
                            .toString();
                }catch (NullPointerException e){
                    fieldValue = "";
                }catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
                    fieldName = "";
                    fieldValue = "";
                }
                result.put(fieldName, fieldValue);
            }

        Iterator<Map.Entry<String, String>> iterator = result.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry e = iterator.next();
            if("".equals(e.getKey())
                    || "".equals(e.getValue())
                    || "0".equals(e.getValue())) iterator.remove();
        }

        ModelAndView modelAndView = new ModelAndView("player");
        modelAndView.addObject("playerFields", result);
        return modelAndView;
    }
}
