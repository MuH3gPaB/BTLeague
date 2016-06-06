package BTTournaments.BTMatch;

import BTTournaments.BTPlayer.IBTPlayer;

/**
 * Интерфейс для работы с классом BTPlayersPair
 */
public interface IBTPlayersPair {
    IBTPlayer getPlayer1();
    IBTPlayer getPlayer2();
    void setPlayer1(IBTPlayer player1);
    void setPlayer2(IBTPlayer player2);
    int getID();
}
