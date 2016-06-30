package config;

/**
 * Класс хранит в себе константы с именами полей и методов для класса, описывающего
 * игрока (изначально это Player). Программа построена таким образом, чтобы не зависить
 * от конкретных названий полей и их количества. Для добавления или удаления полей
 * нужно в том числе добавить (удалить) константы, определенные в этом классе.
 *
 * При добавлении новых полей не забывайте создать новое поле в классе игрока
 */

public class PlayerEntityFields {

    /** Имена полей на русском языке (используются для отображения)*/
    public static final String[] FIELDS = {
            "Имя",
            "Фамилия",
            "Отчество",
            "Возраст",
            "Пол",
            "Страна",
            "Город",
            "Рейтинг ITF"
};

    /** Имена полей, как они определены в классе, описывающем игрока (например Player)
     * по ним осуществляется передача значений между клиентом и сервером */
    public static final String[] FIELDS_NAMES = {
            "firstName",
            "lastName",
            "middleName",
            "age",
            "sex",
            "country",
            "city",
            "itfRate"
    };

    /** Имена методов-геттеров, по ним осуществляется считывание полей из объекта класса игрока */
    public static final String[] GETTERS = {
            "getFirstName",
            "getLastName",
            "getMiddleName",
            "getAge",
            "getSex",
            "getCountry",
            "getCity",
            "getItfRate"
    };

    /** Имена методов-сеттеров, по ним осуществляется запись полей в объект класса игрока*/
    public static final String[] SETTERS = {
            "setFirstName",
            "setLastName",
            "setMiddleName",
            "setAge",
            "setSex",
            "setCountry",
            "setCity",
            "setItfRate"
    };
}
