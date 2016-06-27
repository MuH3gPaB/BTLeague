//import HibernateUtil.*;
//import model.Player;
//import model.PairUnit;
//import model.SingleUnit;
//import org.hibernate.Session;
//import org.junit.Assert;
//import org.junit.Test;
//
//import java.util.ArrayList;
//
//public class HibernateDBTest extends Assert{
//
//    @Test
//    public void HibernateUtilTest(){
//        HibernateUtil.init();
//        HibernateUtil.openSession();
//        Session thisSession = HibernateUtil.getSession();
//        assertNotEquals(null, thisSession);
//        HibernateUtil.getSession();
//    }
//
//    @Test
//    public void SimplePlayerSaveTest(){
//        Player player = new Player("Ivan", "Ivanov");
//        Player player1 = new RatedPlayer("Petr", "Petrov");
//        HibernateUtil.init();
//        HibernateUtil.openSession();
//
//        Dao.save(player);
//        Dao.save(player1);
//
//    }
//
//    @Test
//    public void SimpleReadAllTest(){
//        ArrayList<Player> players;
//        HibernateUtil.init();
//        HibernateUtil.openSession();
//        players = Dao.getAll(Player.class);
//        for (Player player : players) {
//            System.out.println(player.getFirstName());
//        }
//    }
//
//
//    @Test
//    public void SimplePairSaveTest(){
//        RatedPlayer player = new RatedPlayer("Ivan", "Ivanov");
//        RatedPlayer player1 = new RatedPlayer("Petr", "Petrov");
//        player.setRateITF(15);
//        player1.setRateRPTT(10);
//
//        HibernateUtil.init();
//        HibernateUtil.openSession();
//        Dao.save(player);
//        Dao.save(player1);
//
//        // На момент написания теста не было механизмов поиска по базе,
//        // так что вытаскиваем по ID напрямую
//        player = Dao.getById(RatedPlayer.class, 29);
//        player1 = Dao.getById(RatedPlayer.class, 30);
//        PairUnit<RatedPlayer> pair = new PairUnit(player1, player);
//        Dao.save(pair);
//    }
//
//    @Test
//    public void SimpleSingleSaveTest(){
//        RatedPlayer player = new RatedPlayer("Ivan", "Ivanov");
//        RatedPlayer player1 = new RatedPlayer("Petr", "Petrov");
//        player.setRateITF(15);
//        player1.setRateRPTT(10);
//
//        HibernateUtil.init();
//        HibernateUtil.openSession();
//        Dao.save(player);
//        Dao.save(player1);
//
//        // На момент написания теста не было механизмов поиска по базе,
//        // так что вытаскиваем по ID напрямую
//        player = Dao.getById(RatedPlayer.class, 29);
//        player1 = Dao.getById(RatedPlayer.class, 30);
//        SingleUnit<RatedPlayer> single1 = new SingleUnit(player);
//        SingleUnit<RatedPlayer> single2 = new SingleUnit(player1);
//        Dao.save(single1);
//        Dao.save(single2);
//    }
//
//    @Test
//    public void PlayerEqualsTest() {
//        Player player = new RatedPlayer("Ivan", "Ivanov");
//        Player player1 = new RatedPlayer("Ivan", "Ivanov");
//        assertEquals(player1, player);
//    }
//}
