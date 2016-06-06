package BTTournaments.BTMatch;

/**
 * Интерфейс для работы с классом Матч
 */

public interface IBTMatch {
    void setPair1(IBTPlayersPair pair1);
    void setPair2(IBTPlayersPair pair2);
    void setPairs(IBTPlayersPair pair1, IBTPlayersPair pair2);
    IBTPlayersPair getPair1();
    IBTPlayersPair getPair2();
    IBTPlayersPair[] getPairs();
    void addPair(IBTPlayersPair pair);
}
