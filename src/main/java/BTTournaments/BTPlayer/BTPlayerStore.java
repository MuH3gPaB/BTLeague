package BTTournaments.BTPlayer;

import java.util.ArrayList;

/**
 * Класс для хранения игроков
 */
public class BTPlayerStore {

    private IBTPlayerStoreSource source;

    BTPlayerStore (IBTPlayerStoreSource source){
        this.source = source;
    }

    public void setSource(IBTPlayerStoreSource source){
        this.source = source;
    }

    public void saveBTPlayer(IBTPlayer btPlayer) {
        if(!this.source.isEmpty())
            this.source.saveBTPlayer(btPlayer);
    }

    public IBTPlayer loadBTPlayer(int playerID, IBTPlayer player){
        this.source.loadBTPlayer(playerID, player);
        return player;
    }

    public ArrayList<IBTPlayer> loadAllBTPlayers(IBTPlayerStoreSource source){

        return source.loadAllBTPlayers();
    }

    public void updatePlayer(int playerID, IBTPlayer btPlayer, IBTPlayerStoreSource source){
        source.updatePlayer(playerID, btPlayer);
    }
}
