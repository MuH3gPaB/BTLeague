package BTTournaments;

/**
 *  Класс ИГРОК
 */

public class BTPlayer {
    private String firstName;                   // Имя
    private String lastName;                    // Фамилия
    private String middleName;                  // Отчество
    private int age;                            // Возраст
    private enum sex {Male, Female}             // Пол
    private String country;                     // Страна
    private String city;                        // Город
    private int rateITF;                        // Рейтинг ITF
    private int rateRPTT;                       // Рейтинг РПТТ
    private BTPlayerStatistics statistics;      // Статистика игрока
    String[] titls;                             // Титулы
}
