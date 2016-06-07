package BTPlayer;

import BTTournaments.BTPlayer.BTPlayer;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class BTPlayerTest extends Assert{

    @Test
    // Тест работы с титулами
    public void BTPlayerTestTitls(){

    }

    @Test
    // Тест работы конструкторов
    public void BTPlayerTestConstructor(){
        BTPlayer testPlayer = new BTPlayer("Ivan", "Ivanov");
        assertEquals("Ivan", testPlayer.getFirstName());
        assertEquals("Ivanov", testPlayer.getLastName());
    }

    @Test
    // Тест equals
    public void BTPlayerEqualsTest(){
        BTPlayer player1 = new BTPlayer("Dima", "Dimin");
        BTPlayer player2 = new BTPlayer("Dima", "Dimin");
        assertEquals(true, player1.equals(player2));
        assertEquals(true, player1.equals(player1));
        ArrayList<BTPlayer> players = new ArrayList<>();
        players.add(player1);
        boolean result = players.contains(player2);
        assertEquals(true, result);
    }


}
