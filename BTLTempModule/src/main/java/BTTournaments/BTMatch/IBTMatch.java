package BTTournaments.BTMatch;

import java.rmi.NoSuchObjectException;
import java.util.ArrayList;

/**
 * Интерфейс для работы с классом Матч
 */

public interface IBTMatch {
    void addUnit(IBTPlayersUnit unit) throws IndexOutOfBoundsException;
    void removeUnit(IBTPlayersUnit unit) throws NoSuchObjectException;
    ArrayList<IBTPlayersUnit> getUnits();
}
