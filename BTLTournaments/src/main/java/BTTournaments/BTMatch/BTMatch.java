package BTTournaments.BTMatch; /**
 * Класс матч 1
 */

import BTTournaments.BTTournament.BTTournament;

import java.sql.Time;
import java.util.Date;

/**
 * Класс для работы с объектами типа Матч
 */
public class BTMatch implements IBTMatch{
    int stady;                          // Стадия 1/32 1/16 1/8 1/4 1/2 1 - финал
    IBTPlayersPair pair1, pair2;         // Играющие пары
    Date date;                          // Дата
    Time time;                          // Время - для расписания
    String place;                       // Место проведения турнира (?)
    int courtNumber;                    // Номер корта
    BTTournament tournament;            // Турнир
    int[] scores;                       // Счет
    IBTPlayersPair winner;               // Пара - победитель
    int status;                         // Статус Не начат || Идет || Окончен || Прерван
//    ArrayList<BTLComment> comments;
    BTMatchStatistics statistics;

    // Конструкторы
    public BTMatch(IBTPlayersPair pair1, IBTPlayersPair pair2){
        this.pair1 = pair1;
        this.pair2 = pair2;
    }

    public BTMatch(IBTPlayersPair pair1){
        this.pair1 = pair1;
    }

    // Methonds
    public void addPair(IBTPlayersPair pair){
        this.pair2 = pair;
    }

    // Getters & setters

    public void setPair1(IBTPlayersPair pair1) {
        this.pair1 = pair1;
    }

    public void setPair2(IBTPlayersPair pair2) {
        this.pair2 = pair2;
    }

    public void setPairs(IBTPlayersPair pair1, IBTPlayersPair pair2) {
        this.pair1 = pair1;
        this.pair2 = pair2;
    }

    public IBTPlayersPair getPair1() {
        return this.pair1;
    }

    public IBTPlayersPair getPair2() {
        return this.pair2;
    }

    public IBTPlayersPair[] getPairs() {
        IBTPlayersPair[] result = new IBTPlayersPair[2];
        result[0] = this.pair1;
        result[1] = this.pair2;
        return result;
    }
}
