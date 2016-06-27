package BTTournament;

import BTTournaments.BTMatch.BTPlayersPair;
import BTTournaments.BTMatch.IBTMatch;
import BTTournaments.BTPlayer.BTPlayer;
import BTTournaments.BTTournament.BTTournament;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Тест-класс BTTournametn
 */
public class BTTournamentTest extends Assert{

/*    @Test
    public void BTTournamentPairsTest(){
        BTTournament tournament = new BTTournament();
        assertEquals(0, tournament.getPairs().size());
        tournament.addPair(new BTPlayersPair(new BTPlayer("Ivan", "Ivanov"),
                new BTPlayer("Petr", "Petrov")));
        tournament.addPair(new BTPlayersPair(new BTPlayer("Navi", "Vonavi"),
                new BTPlayer("Rtep", "Vortep")));
        assertEquals("Ivan", tournament.getPairs().get(0).getPlayer1().getFirstName());
        assertEquals("Navi", tournament.getPairs().get(1).getPlayer1().getFirstName());
    }

    @Test
    public void BTTournamentGenerateMatchesTest(){
        BTTournament tournament = new BTTournament();
        for (int i = 0; i < 17; i++) {
            tournament.addPair(new BTPlayersPair(new BTPlayer("Name"+i, "Fam"+i),
                    new BTPlayer("Name"+i, "Fam"+i)));
        }
        ArrayList<IBTMatch> matches = new ArrayList<>();
        tournament.generateMatches(matches);
        for (int i = 0; i < tournament.getMatches().size(); i++) {
            System.out.println(tournament.getMatches().get(i).getPair1().getPlayer1().getFirstName()+
                    tournament.getMatches().get(i).getPair2().getPlayer1().getFirstName());
        }
    }*/
}
