package BTPlayer;

import BTTournaments.BTPlayer.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;

/**
 * Класс тестирования записи и чтения игроков из файла
 */
public class BTPlayerStoreSourceFileTest extends Assert {

    @Test
    public void saveLoadTest() {
        String fileName = "C:\\AllJavaProjects\\BTLeague\\temp\\playersTest.txt";
        BTPlayerStore storage = new BTPlayerStore(
                new BTPlayerStoreSourceFile(fileName));
        BTPlayer player1 = new BTPlayer("Petr", "Petrov");
        BTPlayer player2 = new BTPlayer();
        storage.saveBTPlayer(player1);
        storage.loadBTPlayer(1, player2);
        assertEquals(player1.getFirstName(), player2.getFirstName());
        assertEquals(player1.getLastName(), player2.getLastName());
        File file = new File(fileName);
        assertEquals(true, file.delete());
    }

    // Временная хрень для формирования набора файлов с данными
    @Test
    public void temporaryShit(){
        BTPlayer[] players = new BTPlayer[10];
        players[0] = new BTPlayer("Vasya", "Pupkin");
        players[1] = new BTPlayer("Ilya", "Petrov");
        players[2] = new BTPlayer("Lada", "Grin");
        players[3] = new BTPlayer("Mark", "Tven");
        players[4] = new BTPlayer("Elena", "Vaenga");
        players[5] = new BTPlayer("Dima", "Bilan");
        players[6] = new BTPlayer("Tom", "Hanks");
        players[7] = new BTPlayer("Pamelo", "Pupkina");
        players[8] = new BTPlayer("Vitaliy", "Varenitsa");
        players[9] = new BTPlayer("Vova", "Kormovoy");
        String fileName = "C:\\AllJavaProjects\\BTLeague\\temp\\player";
        for (int i = 0; i < 10; i++) {
            BTPlayerStoreSourceFile file = new BTPlayerStoreSourceFile(fileName+i+".txt");
            BTPlayerStore store = new BTPlayerStore(file);
            store.saveBTPlayer(players[i]);
        }
    }
}
