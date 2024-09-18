package demo1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

public class GetConstructorRefAPI {

	public static void main1(String[] args) {
		Class<?> cls = Thread.class;
		
		Constructor<?>[] constructor = cls.getConstructors();
		
		for (Constructor<?> constructor2 : constructor) {
			System.out.println(constructor2);
		}
	}
	
	public static void main(String[] args) {
		Class<?> cls = Thread.class;
		
		Constructor<?>[] constArr = cls.getConstructors();
		
		for (Constructor<?> constructor2 : constArr) {
			String s = Modifier.toString(constructor2.getModifiers());
			String s1 = cls.getSimpleName();
			
			System.out.print(s + " "+ s1+" (");
			
			Parameter[] parArr1 = constructor2.getParameters();
			
			for (Parameter parameter : parArr1) {
				//String s2 = Modifier.toString(parameter.getModifiers());
				String s3 = parameter.getType().getSimpleName();
				String s2 = parameter.getName();
				System.out.print(s3+" "+s2 + ",");
				
			}
			System.out.print(")");
			System.out.println();

		}
	}

}
