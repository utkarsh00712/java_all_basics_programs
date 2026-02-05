package CustomAnnotationWithReflextion;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class TestApp {
public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, NoSuchFieldException {
 Class cls = Class.forName("CustomAnnotationWithReflextion.KodApp");
 Object ref = cls.getDeclaredConstructor().newInstance(); 
 Field field = cls.getDeclaredField("userName");
 Validate v = field.getAnnotation(Validate.class);
 
 System.out.println("MIN: " + v.min());
 System.out.println("MAX: " + v.max());
 System.out.println("MESSAGE: " + v.message());
}

}
