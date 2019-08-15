package my.test.reflact.TestProxy;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflactTest {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
//		Constructor<?>[] constructors = Programmer.class.getConstructors();
//		Field[] fields = Programmer.class.getFields();
//		Field[] declaredFields = Programmer.class.getDeclaredFields();
//		for (Field field : declaredFields) {
//			System.out.println(field.getName());
//		}
//		
//		Method[] declaredMethods = Programmer.class.getDeclaredMethods();
//		for (Method method : declaredMethods) {
//			System.out.println(method);
//		}
		
		Method declaredMethod = Programmer.class.getDeclaredMethod("privatePoint",String.class);
		declaredMethod.setAccessible(true);
		Object invoke = declaredMethod.invoke(Programmer.class.newInstance(), "工作时间久");
		
		Method sesleeping = Programmer.class.getDeclaredMethod("sleeping",null);
		sesleeping.invoke(Programmer.class.newInstance(), null);
//		try {
//			Field field = Programmer.class.getField("name");
//			field.setAccessible(true);
//			System.out.println(field.getName());
//		} catch (NoSuchFieldException | SecurityException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
}
