package BTMatch;

import BTTournaments.BTMatch.BTPlayersPair;
import BTTournaments.BTPlayer.BTPlayer;
import BTTournaments.BTMatch.BTMatchTwin;
import org.junit.Assert;
import org.junit.Test;

import java.rmi.NoSuchObjectException;

/**
 * Класс для тестирования класса BTMatchTwin
 */
public class BTMatchTest extends Assert{

    @Test
    public void BTMatchBaseTest(){

        // Создаем пару1 и пытаемся запихнуть в нее 3 игрока. Ловим эксепшн.
        BTPlayersPair pair1 = new BTPlayersPair();
        try {
            pair1.addPlayer(new BTPlayer("Tim", "Timich"));
            pair1.addPlayer(new BTPlayer("Dim", "Dimich"));
            pair1.addPlayer(new BTPlayer("Kim", "Kimich"));
        }catch (Exception e){
            assertEquals("public class java.lang.IndexOutOfBoundsException",e.getClass().toGenericString());
        }

        // Создаем пару2, добавляем туда двух игроков, проверяем, что нет исключения.
        BTPlayersPair pair2 = new BTPlayersPair();
        try {
            pair2.addPlayer(new BTPlayer("Tim1", "Timich1"));
            pair2.addPlayer(new BTPlayer("Dim1", "Dimich1"));
        }catch (Exception e){
            assertEquals(0,1);
        }

        // Создаем пару3, добавляем туда двух игроков, проверяем, что нет исключения.
        BTPlayersPair pair3 = new BTPlayersPair();
        try {
            pair3.addPlayer(new BTPlayer("Tim1", "Timich1"));
            pair3.addPlayer(new BTPlayer("Dim1", "Dimich1"));
        }catch (Exception e){
            assertEquals(0,1);
        }

        // Создаем матч и пробуем туда засунуть три пары. Ловим исключение.
        BTMatchTwin match = new BTMatchTwin();
        try {
            match.addUnit(pair1);
            match.addUnit(pair2);
            match.addUnit(pair3);
        }catch (Exception e){
            assertEquals("public class java.lang.IndexOutOfBoundsException",e.getClass().toGenericString());
        }

        // Проверяем, что матч и пара читаются
        String tim = match.getUnits().get(0).getPlayers().get(0).getFirstName();
        String dim1 = match.getUnits().get(1).getPlayers().get(1).getFirstName();
        assertEquals("Tim", tim);
        assertEquals("Dim1", dim1);

        // Удаляем обоих игроков из первой пары
        // Третьего удаляем чтобы проверить исключение

        try {
            match.getUnits().get(0).removePlayer(new BTPlayer("Tim", "Timich"));
            match.getUnits().get(0).removePlayer(new BTPlayer("Dim", "Dimich"));
            match.getUnits().get(0).removePlayer(new BTPlayer("Dim", "Dimich"));
        } catch (NoSuchObjectException e) {
            assertEquals("public class java.rmi.NoSuchObjectException",e.getClass().toGenericString());
        }

        // TODO: Добавить функцию переинициализации матча после внисения изменений в поля
        // После удаления обоих игроков из пары матча количество пар должно стать 1
        assertEquals(0, match.getUnits().get(0).getPlayers().size());
        assertEquals(1, match.getUnits().size());

    }

}
