package BTTournaments.BTPlayer;

import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;

/**
 * Класс тестирования записи и чтения игроков из файла
 */
public class BTPlayerStoreSourceFileTest extends Assert {

    @Test
    public void saveLoadTest() {
        BTPlayerStoreSourceFile source = new BTPlayerStoreSourceFile("C:\\AllJavaProjects\\BTLeague\\temp\\playersTest.txt");
        BTPlayer player1 = new BTPlayer("Petr", "Petrov");
        BTPlayer player2 = new BTPlayer();
        BTPlayerStore.saveBTPlayer(player1, source);
        source.loadBTPlayer(1, player2);
        assertEquals(player1.getFirstName(), player2.getFirstName());
        assertEquals(player1.getLastName(), player2.getLastName());
    }
}
