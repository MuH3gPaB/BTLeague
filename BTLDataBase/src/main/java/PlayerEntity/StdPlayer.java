package PlayerEntity;

import HibernateUtil.Dao;
import org.hibernate.annotations.OptimisticLock;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("RatedPlayer")
public class StdPlayer extends Player{

    @Column
    private int rateITF;

    @Column
    private int rateRPTT;

    // Constructors

    public StdPlayer(String name, String surname) {
        super(name, surname);
    }

    public StdPlayer() {
    }


    // Additional getters & setters

    public int getRateITF() {
        return rateITF;
    }

    public void setRateITF(int rateITF) {
        this.rateITF = rateITF;
    }

    public int getRateRPTT() {
        return rateRPTT;
    }

    public void setRateRPTT(int rateRPTT) {
        this.rateRPTT = rateRPTT;
    }
}
