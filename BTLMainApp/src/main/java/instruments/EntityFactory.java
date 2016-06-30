package instruments;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;

/** Класс для обработки данных, поступивших из формы*/

//TODO: Переписать метод под идею с конфигурационным файлом

public class EntityFactory {

    /** Создание объектов игроков из входных данных и класса выходного объекта
     *
     * @param values карта значений (имя поля с маленькой буквы!(String), значение (String))
     * @param playerClass класс в который записываться данные
     * @return заполненный объект типа playerClass
     *
     * Метод будет выбрасывать исключения. Пока не реализовано.
     */

    public static Object createPlayer(Map<String, String> values, Class playerClass){
        Object result = null;
        try {
            result = playerClass.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }

        Field[] fields = playerClass.getDeclaredFields();

        for(Field field : fields){
            if(values.containsKey(field.getName()))
                try {
                    String setterName = "set"+field.getName().substring(0,1).toUpperCase()+field.getName().substring(1);
                    Method setter = playerClass.getMethod(setterName, field.getType());
                    Object arg;
                    if (field.getType().isPrimitive()){
                        String typeName = field.getType().getName();
                        if(typeName.equals("char")){
                            arg = values.get(field.getName()).charAt(0);
                        }
                        else {
                            String className = (Objects.equals(typeName, "int")) ? "java.lang.Integer" :
                                    "java.lang."+typeName.substring(0,1).toUpperCase()+typeName.substring(1);
                            Class argBox = Class.forName(className);
                            Method valueOf = argBox.getMethod("valueOf", String.class);
                            arg =  argBox.getConstructor(field.getType()).newInstance(0);
                            arg = valueOf.invoke(arg, values.get(field.getName()));
                        }
                    }
                    else {
                        arg = values.get(field.getName());
                    }

                    setter.invoke(result, arg);

                    // TODO: Добавить обработчик ошибок
                } catch (NoSuchMethodException |
                        InvocationTargetException |
                        IllegalAccessException |
                        ClassNotFoundException |
                        InstantiationException e) {
                    e.printStackTrace();
                }
        }
        return result;
    }
}

