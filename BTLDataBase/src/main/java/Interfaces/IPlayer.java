package Interfaces;

import java.lang.reflect.Field;
import java.lang.reflect.Parameter;
import java.util.ArrayList;

/**
* Интерфейс для работы с классом игроков
 */

public interface IPlayer {
    int getPlayer_ID();
    String getFirstName();
    String getLastName();
    String getMiddleName();
    int getAge();
    String getCountry();
    String getCity();

    void setPlayer_ID(int iD);
    void setFirstName(String firstName);
    void setLastName(String lastName);
    void setMiddleName(String middleName);
    void setAge(int age);
    void setCountry(String country);
    void setCity(String city);
}
