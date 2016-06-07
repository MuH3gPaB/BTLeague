package BTTournaments.BTMatch;

import BTTournaments.BTPlayer.IBTPlayer;

import java.rmi.NoSuchObjectException;
import java.util.ArrayList;

/**
 * Интерфейс для работы с классом BTPlayersPair
 */
public interface IBTPlayersUnit {
    void addPlayer(IBTPlayer player) throws IndexOutOfBoundsException;
    void removePlayer(IBTPlayer player) throws NoSuchObjectException;
    ArrayList<IBTPlayer> getPlayers();
    int getID();
}
