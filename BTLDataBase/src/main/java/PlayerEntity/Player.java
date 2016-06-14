package PlayerEntity;

import Interfaces.IPlayer;
import javax.persistence.*;



@Entity
@Table(name = "players")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "pl_type")
@DiscriminatorValue("BasePlayerClass")
public class Player implements IPlayer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int player_ID;                       // ID

    @Column
    private String firstName;                   // Имя

    @Column
    private String lastName;                    // Фамилия

    @Column
    private String middleName;                  // Отчество

    @Column
    private int age;                            // Возраст

    @Column
    private Sex sex;                            // Пол

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

    // Getters & settelers

    public int getPlayer_ID() {
        return player_ID;
    }

    public void setPlayer_ID(int player_ID) {
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
        return city;
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

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

}