package BTTournaments; /**
 * Класс матч 1
 */

import BTGeneral.BTLComment;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Muxa on 31.05.2016.
 */
public class BTMatch {
    BTPlayersPair pair1, pair2;
    Date date;
    Time time;
    String place;
    int courtNumber;
    BTTournament tournament;
    int[] scores;
    BTPlayersPair winner;
    boolean finished;
    ArrayList<BTLComment> comments;
    BTMatchStatistics statistics;
}
