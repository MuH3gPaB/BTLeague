import HibernateUtil.*;
import PlayerEntity.Player;
import PlayerEntity.StdPlayer;
import org.hibernate.Session;
import org.junit.Assert;
import org.junit.Test;

public class HibernateDBTest extends Assert{

    @Test
    public void HibernateUtilTest(){
        HibernateUtil.init();
        HibernateUtil.openSession();
        Session thisSession = HibernateUtil.getSession();
        assertNotEquals(null, thisSession);
        HibernateUtil.closeSession();
    }

    @Test
    public void SimplePlayerSaveLoadTest(){
        Player player = new StdPlayer("Ivan", "Ivanov");
        Player player1;
        HibernateUtil.init();
        HibernateUtil.openSession();

        Dao.save(player);

        player1 = Dao.getById(StdPlayer.class, 25);

        assertEquals(player, player1);
        HibernateUtil.closeSession();
    }

    @Test
    public void PlayerEqualsTest() {
        Player player = new StdPlayer("Ivan", "Ivanov");
        Player player1 = new StdPlayer("Ivan", "Ivanov");
        assertEquals(player1, player);
    }
}
