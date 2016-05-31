package BTTournaments;

import java.util.Date;

/**
 * Класс турнир
 * TODO: Добавить организатора, контакты, дедлайн регистрации, начало и конец турнира
 */

public class BTTournament {
    String name;
    Date date;
    String place;
    enum classification {RPTT, ITF};
    int grade;
    BTTournamentNet maleNet, femaleNet, mixedNet;
}
