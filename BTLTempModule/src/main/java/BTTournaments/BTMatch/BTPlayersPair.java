package BTTournaments.BTMatch;

import BTTournaments.BTPlayer.IBTPlayer;

import java.rmi.NoSuchObjectException;
import java.util.ArrayList;

/**
 * Класс определяющий пару (играющую единицу)
 * планируется использовать в построении турнирных сеток и расписания
 */


public final class BTPlayersPair implements IBTPlayersUnit {
    private static final int PAIR_UNIT_SIZE = 2;
    private ArrayList<IBTPlayer> players;
    private int id;

    // Конструкторы
    public BTPlayersPair(){
        this.players = new ArrayList<>();
    }

    // TODO: Доделать этот конструктор
    public BTPlayersPair(IBTPlayer pl1, IBTPlayer pl2){
        this.players = new ArrayList<>();
        players.add(pl1);
        players.add(pl2);
    }

    // Methods

    public void addPlayer(IBTPlayer player) throws IndexOutOfBoundsException{
        if(player == null) return;
        if(players.size() < PAIR_UNIT_SIZE) players.add(player);
        else throw new IndexOutOfBoundsException();
    }

    public void removePlayer(IBTPlayer player) throws NoSuchObjectException{
        if(player == null) return;
        if(players.contains(player)) players.remove(player);
        else throw new NoSuchObjectException(player.toString());
    }

    public ArrayList<IBTPlayer> getPlayers(){
        if(this.players != null) return this.players;
        else {
            this.players = new ArrayList<>();
            return this.players;
        }
    }

    public boolean equals(IBTPlayersUnit players){
        return (this.players.equals(players));
    }

    // Getters and Setters
    public int getID() {
        return id;
    }
}
