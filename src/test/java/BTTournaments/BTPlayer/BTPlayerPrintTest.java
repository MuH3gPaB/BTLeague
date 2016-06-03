package BTTournaments.BTPlayer;

import org.junit.Assert;
import org.junit.Test;

import java.io.*;


/**
 * Тестирование вывода информации об игроке
 */
public class BTPlayerPrintTest extends Assert{

    @Test
    public void BTPlayerPrintScreenTest(){
        BTPlayer player = new BTPlayer("Dima", "Pupkin");
        BTPlayerPrintScreen a = new BTPlayerPrintScreen();
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(ba);
        System.setOut(ps);

        a.print(player, "FirstName");
        assertEquals(ba.toString(), "Dima\n");
        ba.reset();
        a.print(player, "LastName");
        assertEquals(ba.toString(), "Pupkin\n");
        ba.reset();
        a.print(player, "hz");
        assertEquals(ba.toString(), "Поле недоступно!\n");
        ba.reset();
    }

}
