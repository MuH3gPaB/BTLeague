package BTTournaments.BTPlayer;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Класс для вывода на экран данных об игроке
 */
public class BTPlayerPrintScreen implements IBTPlayerPrintScreen {

    public void print(IBTPlayer player, String fieldName) {
        try {
            Method getter = player.getClass().getMethod("get"+fieldName, null);
            Object i = getter.invoke(player, null);
            System.out.printf("%s\n", i.toString());
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            System.out.printf("Поле недоступно!\n");
        }
    }
}
