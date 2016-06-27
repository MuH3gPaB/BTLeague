package instruments;

import model.Player;

import java.util.Comparator;

public class PlayerComparator implements Comparator<Player> {


    @Override
    public int compare(Player o1, Player o2) {
        return o1.getFirstName().compareTo(o2.getFirstName());
    }

    @Override
    public boolean equals(Object obj) {
        return this.equals(obj);
    }
}
