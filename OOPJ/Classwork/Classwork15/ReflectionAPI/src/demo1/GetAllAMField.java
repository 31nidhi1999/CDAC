package demo1;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

class Sample{
	private int z;
}
class sampleImpl extends Sample{
	
	int w;
	protected int a;
	private double z1;
	public int y;
}


public class GetAllAMField {

	public static void main1(String[] args) {
		
		/**Giives us only public fileds of class */
		Class<?> c= sampleImpl.class;	
		Field[] f= c.getFields();
		for (Field field : f) {
 			String s = Modifier.toString(field.getModifiers());
 			System.out.println(s+" "+field.getType().getSimpleName()+" "+field.getName());
		}
		
	}
	
	public static void main(String[] args) {

		/**Gives all access modifier filed of class  */
		Class<?> c= sampleImpl.class;	
		System.out.println("\nModiler, Type & simple Fileds name of the class"+ c.getSimpleName());
		Field[] f= c.getDeclaredFields();
		for (Field field : f) {
			String s = Modifier.toString(field.getModifiers());
			System.out.println(s+" "+field.getType().getSimpleName()+" "+field.getName());

		}

	}

}
