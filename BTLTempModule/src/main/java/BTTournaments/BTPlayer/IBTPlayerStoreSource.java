package BTTournaments.BTPlayer;

import java.util.ArrayList;

/**
 * Интерфейс для работы с процедурами хранения игроков
 */
public interface IBTPlayerStoreSource {
    boolean isEmpty();
    void saveBTPlayer(IBTPlayer btPlayer);
    void loadBTPlayer(int playerID, IBTPlayer player);
    ArrayList<IBTPlayer> loadAllBTPlayers();
    void updatePlayer(int playerID, IBTPlayer btPlayer);
}
