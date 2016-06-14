package UnitsEntity;

import PlayerEntity.Player;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 * Класс для хранения одиночек
 */

@Entity
@DiscriminatorValue("single")
public class SingleUnit<PlayerClass> extends Unit{

    @ManyToOne(targetEntity = Player.class)
    protected PlayerClass player1;

    public SingleUnit(){

    }

    public SingleUnit(PlayerClass player){
        this.player1 = player;
    }

    @Override
    public boolean equals(Object o) {
        if(o == null) return false;
        if(o.getClass() != this.getClass()) return false;
        if(o == this) return true;

        SingleUnit punit = (SingleUnit) o;
        return this.player1.equals(punit.getPlayer1());
    }

    @Override
    public int hashCode() {
        return 0;
    }

    public void setPlayer1(PlayerClass player) {
        this.player1 = player;
    }

    public PlayerClass getPlayer1() {
        return this.player1;
    }
}
