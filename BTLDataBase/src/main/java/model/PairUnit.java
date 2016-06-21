package model;


import javax.persistence.*;


/**
 * Этот класс хранит "боевую" единицу.
 * В соревнованиях могу участвовать
 * Отдельные игроки
 * Пары
 * Тройки
 * Команды
 *
 * Базовая единица - пара
 *
 * Юнит всегда состоит из игроков - тип класса игрока указывается в дженерике
 */

//@Entity
//@DiscriminatorValue("Pair")
//public class PairUnit<PlayerClass extends Player> extends SingleUnit {
//
////    @ManyToOne(targetEntity = Player.class)
////    private PlayerClass player1;
//
//    @ManyToOne(targetEntity = Player.class)
//    protected PlayerClass player2;
//
//    // Constructors
//
//    public PairUnit(){
//    }
//
//    public PairUnit(PlayerClass player1, PlayerClass player2) {
//        if (player1 != null && player2 != null) {
//            this.player1 = player1;
//            this.player2 = player2;
//        }
//    }
//
//    // Methods
//
//
//    @Override
//    public boolean equals(Object o){
//        if(o == null) return false;
//        if(o.getClass() != this.getClass()) return false;
//        if(o == this) return true;
//
//        PairUnit punit = (PairUnit) o;
//        return (
//                        (this.player1.equals(punit.getPlayer1()) &&
//                        (this.player2.equals(punit.getPlayer2())
//                ) || (
//                        (this.player1.equals(punit.getPlayer2()) &&
//                        (this.player2.equals(punit.getPlayer1())
//                        )))));
//    }
//
//    // TODO: Реализовать
//    public int hashCode(){
//        return 0;
//    }
//
//
//    // Getters&Setters
//
//    public PlayerClass getPlayer2() {
//        return player2;
//    }
//
//    public void setPlayer2(PlayerClass player2) {
//        this.player2 = player2;
//    }
//}
