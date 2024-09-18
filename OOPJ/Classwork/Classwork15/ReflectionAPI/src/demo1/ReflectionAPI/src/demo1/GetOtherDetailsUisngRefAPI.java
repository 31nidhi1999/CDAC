package demo1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class GetOtherDetailsUisngRefAPI {

	public static void main(String[] args) {
		
		Class<?> cls = Thread.class;
		
		System.out.println("Get pacakage name ::"+ cls.getPackageName());
		System.out.println("Get class name only ::"+cls.getSimpleName());
		System.out.println("Get full qualified name :: "+cls.getName());
		System.out.println("Get super class full qualified name ::"+cls.getSuperclass());
		
		Class<?> cls1 = cls.getSuperclass();
		String cls2 = cls1.getSimpleName();
 		System.out.println("Get super clas name only"+cls2+"\n");
 		
 		
 		System.out.println("Inetrface of the class"+ cls.getSimpleName());
 		Class<?>[] cls3 = cls.getInterfaces();
 		for (Class<?> class1 : cls3) {
			System.out.println(class1);
		}
 		
 		System.out.println("\nFileds of the class"+ cls.getSimpleName());
 		Field[] filed = cls.getFields();
 		for (Field field : filed) {
			System.out.println(field);
		}
 		
 		/**to get mooduileder, type & name*/
 		System.out.println("\nModiler, Type & simple Fileds name of the class"+ cls.getSimpleName());
 		Field[] filed1 = cls.getFields();
 		for (Field field : filed1) {
 			String s = Modifier.toString(field.getModifiers());
 			System.out.println(s+" "+field.getType()+" "+field.getName());
		}
 		
 		System.out.println("Cobstructor for ");
 		Class<?> cls11 = GetClassReference.class;
 		System.out.println("\nConstructor");
 		Constructor[] contr=cls11.getConstructors();
 		for (Constructor constructor : contr) {
			System.out.println(constructor);
		}
 		
	}

}
