package BTPlayer;

import BTTournaments.BTPlayer.BTPlayer;
import org.junit.Assert;
import org.junit.Test;

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


}
