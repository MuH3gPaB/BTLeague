package instruments;


import model.Player;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class EntityFactoryTest extends Assert {

    @Test
    public void entityFactoryTest(){
        Map<String, String> values = new HashMap<>();
        values.put("mychar", "V");
        values.put("mydouble", "234");
        values.put("myint", "11");
        values.put("mystring", "Oppa");
        TestClass testClass;
        testClass = (TestClass) EntityFactory.createPlayer(values, TestClass.class);
        System.out.println(testClass.getMychar() + "\n" + testClass.getMydouble() + "\n"
                + testClass.getMyint() + "\n" +testClass.getMystring());
    }

}
