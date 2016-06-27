package BTTournaments.BTMatch; /**
 * Класс матч 1
 */

import BTTournaments.BTTournament.BTTournament;

import java.rmi.NoSuchObjectException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

/**
 * Класс для работы с объектами типа Матч
 */
public class BTMatchTwin implements IBTMatch{
    private static final int TWIN_MATCH_SIZE = 2;
    private int stady;                          // Стадия 1/32 1/16 1/8 1/4 1/2 1 - финал
    private ArrayList<IBTPlayersUnit> units;    // Играющие юниты
    private Date date;                          // Дата
    private Time time;                          // Время - для расписания
    private String place;                       // Место проведения турнира (?)
    private int courtNumber;                    // Номер корта
    private int[] scores;                       // Счет
    private IBTPlayersUnit winner;              // Пара - победитель
    private int status;                                 // Статус Не начат || Идет || Окончен || Прерван

    // Конструкторы
    public BTMatchTwin(ArrayList units){
        if(units != null) this.units = units;
        else this.units = new ArrayList<>();
    }

    public BTMatchTwin(){
        this.units = new ArrayList<>();
    }

    // Methonds
    public void addUnit(IBTPlayersUnit unit) throws IndexOutOfBoundsException{
        if(unit == null) return;
        if(units.size() < TWIN_MATCH_SIZE) units.add(unit);
        else throw new IndexOutOfBoundsException();
    }


    public void removeUnit(IBTPlayersUnit unit) throws NoSuchObjectException {
        if(unit == null) return;
        if(units.contains(unit)) units.remove(unit);
        else throw new NoSuchObjectException(unit.toString());
    }

    public ArrayList<IBTPlayersUnit> getUnits(){
        if(this.units != null) return this.units;
        else {
            this.units = new ArrayList<>();
            return this.units;
        }
    }

    // Getters & setters

}
