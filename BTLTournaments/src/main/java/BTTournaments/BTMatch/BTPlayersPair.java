package BTTournaments.BTMatch;

import BTTournaments.BTPlayer.IBTPlayer;

/**
 * Класс определяющий пару (играющую единицу)
 * планируется использовать в построении турнирных сеток и расписания
 */


public class BTPlayersPair implements IBTPlayersPair{
    private IBTPlayer player1;
    private IBTPlayer player2;
    private int id;

    public BTPlayersPair(IBTPlayer player1, IBTPlayer player2){
        this.player1 = player1;
        this.player2 = player2;
    }

    public boolean equals(IBTPlayersPair pair){
        return (this.player1 == pair.getPlayer1()) && (this.player2 == pair.getPlayer2());
    }

    public IBTPlayer getPlayer1() {
        return this.player1;
    }

    public IBTPlayer getPlayer2() {
        return this.player2;
    }

    public void setPlayer1(IBTPlayer player1) {
        this.player1 = player1;
    }

    public void setPlayer2(IBTPlayer player2) {
        this.player2=player2;
    }

    public int getID() {
        return id;
    }
}
