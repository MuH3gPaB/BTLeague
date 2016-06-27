package BTTournaments.BTPlayer;

import java.util.ArrayList;

/**
* Интерфейс для работы с классом игроков
 */

public interface IBTPlayer {
    int getPlayerID();
    String getFirstName();
    String getLastName();
    String getMiddleName();
    int getAge();
    String getCountry();
    String getCity();
    int getRateITF();
    int getRateRPTT();
    ArrayList<String> getTitls();

    void setPlayerID(int iD);
    void setFirstName(String firstName);
    void setLastName(String lastName);
    void setMiddleName(String middleName);
    void setAge(int age);
    void setCountry(String country);
    void setCity(String city);
    void setRateITF(int rateITF);
    void setRateRPTT(int rateRPTT);
}
