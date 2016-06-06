package BTTournaments.BTTournament;

import BTTournaments.BTMatch.BTMatch;
import BTTournaments.BTMatch.BTPlayersPair;
import BTTournaments.BTMatch.IBTMatch;
import BTTournaments.BTMatch.IBTPlayersPair;
import BTTournaments.BTPlayer.BTPlayer;
import BTTournaments.BTPlayer.IBTPlayer;

import java.util.ArrayList;
import java.util.Date;

/**
 * Класс турнир
 * TODO: Добавить организатора, контакты, дедлайн регистрации, начало и конец турнира
 */

public class BTTournament {
    private String name;
    private Date date;
    private String place;
    private enum classification {RPTT, ITF};
    private int grade;
    private BTTournamentNet maleNet, femaleNet, mixedNet;
    private ArrayList<IBTMatch> matches;
    private ArrayList<IBTPlayersPair> pairs;

    public void addPair(IBTPlayersPair pair){
        if(pairs == null) pairs = new ArrayList<IBTPlayersPair>();
        pairs.add(pair);
    }

    public void generateMatches(ArrayList<IBTMatch> matches){
        if((matches != null) && (pairs != null)) {
            this.matches = matches;
            matches.clear();
            int netSize = 1;
            for (double i = pairs.size(); i > 1; i=i/2, netSize = netSize * 2);

            for (int i = 0; i < pairs.size(); i++) {
                if(i <= netSize/2 - 1)matches.add(new BTMatch(pairs.get(i)));
                else matches.get(i-netSize/2).addPair(pairs.get(i));
            }
            for (int i = 0; i < netSize-pairs.size() ; i++) {
                matches.get(matches.size()-i-1).addPair(new BTPlayersPair(new BTPlayer("Bye"), new BTPlayer("Bye")));
            }
        }
    }

    // Конструкторы
    public BTTournament(String name){
        this.name = name;
    }

    public BTTournament(){

    }

    // Getters Setters
    public ArrayList<IBTPlayersPair> getPairs() {
        return (pairs == null) ? new ArrayList<IBTPlayersPair>() : pairs;
    }

    public void setPairs(ArrayList<IBTPlayersPair> pairs) {
        this.pairs = pairs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<IBTMatch> getMatches() {
        return matches;
    }

    public void setMatches(ArrayList<IBTMatch> matches) {
        this.matches = matches;
    }
}
