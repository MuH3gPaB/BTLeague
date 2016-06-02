package BTTournaments.BTPlayer;

import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * Класс для хранения игроков
 */
public class BTPlayerStore {

    public static void saveBTPlayer(IBTPlayer btPlayer, IBTPlayerStoreSource source) {
        if(source != null)
            source.saveBTPlayer(btPlayer);
    }

    public IBTPlayer loadBTPlayer(int playerID, IBTPlayerStoreSource source, IBTPlayer player){
        source.loadBTPlayer(playerID, player);
        return player;
    }

    public ArrayList<IBTPlayer> loadAllBTPlayers(IBTPlayerStoreSource source){

        return source.loadAllBTPlayers();
    }

    public void updatePlayer(int playerID, IBTPlayer btPlayer, IBTPlayerStoreSource source){
        source.updatePlayer(playerID, btPlayer);
    }
}
