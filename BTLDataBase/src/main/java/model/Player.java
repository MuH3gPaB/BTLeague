package model;

import config.PlayerEntityFields;

import javax.persistence.*;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


@Entity
@Table(name = "players")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "pl_type")
@DiscriminatorValue("BasePlayerClass")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long player_ID;                       // ID

    @Column
    private String firstName;                   // Имя

    @Column
    private String lastName;                    // Фамилия

    @Column
    private String middleName;                  // Отчество

    @Column
    private int age;                            // Возраст

    @Column
    private String sex;                            // Пол

    @Column
    private String country;                     // Страна

    @Column
    private String city;                        // Город


    // Конструкторы
    public Player(String fstName, String lstName){
        if(!fstName.isEmpty() && !lstName.isEmpty()) {
            this.firstName = fstName;
            this.lastName = lstName;
        }
    }

    public Player(String fstName){
        if(!fstName.isEmpty()){
            this.firstName=fstName;
            this.lastName="";
        }
    }

    public Player(){

    }

    // Methods

    // TODO: Поправить метод, когда все поля будут заполнены
    @Override
    public boolean equals(Object o){
        if(o == null) return false;
        if(o.getClass() != this.getClass()) return false;
        if(o == this) return true;

        Player player = (Player) o;
        return (this.firstName.equals(player.getFirstName())) &&
                (this.lastName.equals(player.getLastName()));
    }

    // TODO: Реализовать
    public int hashCode(){
        return 0;
    }

    // TODO: Вытащил метод из контроллера, хорошо бы рефакторить под класс
    public Map<String, String> getNotEmptyFieldsAsMap(){
        Map<String, String> result = new HashMap<>();
        for (int i = 0; i < PlayerEntityFields.fields.length; i++) {
            String fieldValue;
            String fieldName = PlayerEntityFields.fields[i];
            try {
                fieldValue = this.getClass()
                        .getMethod(PlayerEntityFields.getters[i])
                        .invoke(this, null)
                        .toString();
            }catch (NullPointerException e){
                fieldValue = "";
            }catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
                fieldName = "";
                fieldValue = "";
            }
            result.put(fieldName, fieldValue);
        }

        Iterator<Map.Entry<String, String>> iterator = result.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry e = iterator.next();
            if("".equals(e.getKey())
                    || "".equals(e.getValue())
                    || "0".equals(e.getValue())) iterator.remove();
        }
        return result;
    }

    // Getters & settelers

    public long getPlayer_ID() {
        return player_ID;
    }

    public void setPlayer_ID(long player_ID) {
        this.player_ID = player_ID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return (city == null) ? "" : city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

}