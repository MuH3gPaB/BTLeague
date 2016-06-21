package config;

// Порядковый номер геттера соответствует порядковому номеру поля

public class PlayerEntityFields {
    public static final String[] fields = {
        "Имя",
        "Фамилия",
        "Отчество",
        "Возраст",
        "Пол",
        "Страна",
        "Город"
};

    public static final String[] getters = {
            "getFirstName",
            "getLastName",
            "getMiddleName",
            "getAge",
            "getSex",
            "getCountry",
            "getCity"
    };
}
