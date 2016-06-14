package UnitsEntity;

import Interfaces.IPlayer;


import javax.persistence.*;

/**
 * Базовый класс для определения игровых единиц
 *
 * Тут можно будет потом добавить статистику или вносить изменения, общие
 * для всех игровых единиц
 */

@Entity
@Table(name = "units")
@DiscriminatorColumn(name = "UnitType")

// TODO: Добавить интерфейс статистики

public abstract class Unit<PlayerClass extends IPlayer> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int unit_id;

    public Unit(){

    }

    public abstract boolean equals(Object o);

    public abstract int hashCode();


    public int getUnit_id() {
        return unit_id;
    }

    public void setUnit_id(int unit_id) {
        this.unit_id = unit_id;
    }
}
