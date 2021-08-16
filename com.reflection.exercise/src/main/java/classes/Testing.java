package classes;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class Testing {

	@Test
	public void reflectStuff() throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		Class<?> Person = Class.forName("classes.Person");
//		Object Person = new Person();
//		System.out.println(Person.getClass().getPackage().getName());

//		System.out.println(Person.getClass().getSuperclass().getSimpleName());
		
//		Class<?>[] PersonInterfaces = Person.getInterfaces();
//		System.out.println(PersonInterfaces[0].getSimpleName());

		
//		Constructor<?>[] constructors = Person.getConstructors();
//		System.out.println(constructors[0].getName());
		
//		Field[] fields = Person.getDeclaredFields();
//		System.out.println(getFieldNames(fields));
		
//		Method[] methods = Person.getMethods();
//		System.out.println(getMethodNames(methods));
		
		Class<?> birdClass = Class.forName("classes.Bird");
//		Constructor<?>[] birdConstructors = birdClass.getConstructors();
//		
		Constructor<?> cons1 = birdClass.getConstructor();
		Constructor<?> cons2 = birdClass.getConstructor(String.class, boolean.class);
//		System.out.println(cons1);
		Constructor<?> cons3 = birdClass.getConstructor(String.class);
		
		Bird myBird = (Bird) cons2.newInstance("Pesho", true);
		System.out.println(myBird.getName());
	}

	private static List<String> getMethodNames(Method[] methods){
		List<String> methodsNames = new ArrayList<>();
		
		for (Method method : methods)
			methodsNames.add(method.getName());
		return methodsNames;
	}
	
	private static List<String> getFieldNames(Field[] fields) {
		List<String> fieldNames = new ArrayList<>();

		for (Field field : fields)
			fieldNames.add(field.getName());
		return fieldNames;
	}
}
