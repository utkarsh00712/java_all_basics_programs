package CustomAnnotations;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
   Class<?> cls= Class.forName("CustomAnnotations.Employee");
   Object obj = cls.getDeclaredConstructor(String.class, int.class, int.class).newInstance("Utkarsh",123,21);
   Method m = cls.getDeclaredMethod("greet");
   m.setAccessible(true);
   m.invoke(obj);
   
   Method m1 = cls.getDeclaredMethod("get", String.class, int.class, int.class);
   m1.setAccessible(true);
   m1.invoke(obj, "Utkarsh", 123, 21);
}
}
