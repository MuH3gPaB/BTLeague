package BTTournaments.BTPlayer;

import java.util.ArrayList;

/**
 *  Класс ИГРОК
 */

public class BTPlayer implements IBTPlayer {
    private int playerID;                       // ID
    private String firstName;                   // Имя
    private String lastName;                    // Фамилия
    private String middleName;                  // Отчество
    private int age;                            // Возраст
    private enum sex {Male, Female}             // Пол
    private String country;                     // Страна
    private String city;                        // Город
    private int rateITF;                        // Рейтинг ITF
    private int rateRPTT;                       // Рейтинг РПТТ
    private Object statistics;                  // Статистика игрока
    private ArrayList<String> titls;            // Титулы



    // Конструкторы
    public BTPlayer(String fstName, String lstName){
        if(!fstName.isEmpty() && !lstName.isEmpty()) {
            this.firstName = fstName;
            this.lastName = lstName;
        }
    }

    public BTPlayer(String fstName){
        if(!fstName.isEmpty()){
            this.firstName=fstName;
            this.lastName="";
        }
    }

    public BTPlayer(){

    }

    // Добавление титула
    public void addTitle (String title){
        if(!title.isEmpty()) titls.add(title);
    }

    // Получение и установка значений полей
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getRateITF() {
        return rateITF;
    }

    public void setRateITF(int rateITF) {
        this.rateITF = rateITF;
    }

    public int getRateRPTT() {
        return rateRPTT;
    }

    public void setRateRPTT(int rateRPTT) {
        this.rateRPTT = rateRPTT;
    }

    public Object getStatistics() {
        return statistics;
    }

    public void setStatistics(IBTPlayerStatistics statistic) {
        this.statistics = statistic.getStatistics();
    }

    public ArrayList<String> getTitls() {
        return titls;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPlayerID() {
        return playerID;
    }

    public void setPlayerID(int id) {
        this.playerID = id;
    }




}
