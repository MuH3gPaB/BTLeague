import HibernateUtil.*;
import PlayerEntity.Player;
import PlayerEntity.StdPlayer;
import UnitsEntity.PairUnit;
import UnitsEntity.SingleUnit;
import UnitsEntity.Unit;
import org.hibernate.Session;
import org.junit.Assert;
import org.junit.Test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class HibernateDBTest extends Assert{

    @Test
    public void HibernateUtilTest(){
        HibernateUtil.init();
        HibernateUtil.openSession();
        Session thisSession = HibernateUtil.getSession();
        assertNotEquals(null, thisSession);
        HibernateUtil.getSession();
    }

    @Test
    public void SimplePlayerSaveTest(){
        Player player = new Player("Ivan", "Ivanov");
        Player player1 = new StdPlayer("Petr", "Petrov");
        HibernateUtil.init();
        HibernateUtil.openSession();

        Dao.save(player);
        Dao.save(player1);

    }

    @Test
    public void SimpleReadAllTest(){
        ArrayList<Player> players = new ArrayList<>();
        HibernateUtil.init();
        HibernateUtil.openSession();
        players = Dao.getAll(Player.class);
        for (int i = 0; i < players.size(); i++) {
            System.out.println(players.get(i).getFirstName());
        }
    }


    @Test
    public void SimplePairSaveTest(){
        StdPlayer player = new StdPlayer("Ivan", "Ivanov");
        StdPlayer player1 = new StdPlayer("Petr", "Petrov");
        player.setRateITF(15);
        player1.setRateRPTT(10);

        HibernateUtil.init();
        HibernateUtil.openSession();
        Dao.save(player);
        Dao.save(player1);
        player = Dao.getById(StdPlayer.class, 29);
        player1 = Dao.getById(StdPlayer.class, 30);
        PairUnit<StdPlayer> pair = new PairUnit(player1, player);
        Dao.save(pair);
    }

    @Test
    public void SimpleSingleSaveTest(){
        StdPlayer player = new StdPlayer("Ivan", "Ivanov");
        StdPlayer player1 = new StdPlayer("Petr", "Petrov");
        player.setRateITF(15);
        player1.setRateRPTT(10);

        HibernateUtil.init();
        HibernateUtil.openSession();
        Dao.save(player);
        Dao.save(player1);
        player = Dao.getById(StdPlayer.class, 29);
        player1 = Dao.getById(StdPlayer.class, 30);
        SingleUnit<StdPlayer> single1 = new SingleUnit(player);
        SingleUnit<StdPlayer> single2 = new SingleUnit(player1);
        Dao.save(single1);
        Dao.save(single2);
    }

    @Test
    public void PlayerEqualsTest() {
        Player player = new StdPlayer("Ivan", "Ivanov");
        Player player1 = new StdPlayer("Ivan", "Ivanov");
        assertEquals(player1, player);
    }
}
