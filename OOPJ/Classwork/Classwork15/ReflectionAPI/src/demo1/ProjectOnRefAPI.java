package demo1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Scanner;

class Claculator{
	public  double sum(double d, int i, float f ) {
		return d + i+ f;
	}
	
	public double sub(double d, float f ) {
		return d - f;
	}
}


//converting string to required dt
class Convert{
	
	public static Object change(String parameter, String value) {
		
		double result=0;
		
		switch (parameter) {
		case "int" : 
			result= Integer.parseInt(value);

		case "float":
			result= Float.parseFloat(value);


		case "double":
			result= Double.parseDouble(value);

		}
		return result;

	}
}

public class ProjectOnRefAPI {

	public static void main(String[] args) {
		
		//try with resource
		try(Scanner sc = new Scanner(System.in)){
			
			//asking user to enter fq class name(pacge + clas s name)
			System.out.println("Enter the full quarified name ::");
			String classname = sc.nextLine(); 
			
			//will get refernce of the the required class
			Class<?> classNameRef = Class.forName(classname);
			
			//get method in Method[]
			Method[] methods=classNameRef.getDeclaredMethods();
			
			//ask the method to get executed
			System.out.println("Enter the method name ::");
			String methodName = sc.nextLine();
			
			//check in the Method[] id our given method is present or not
			for (Method method : methods) {
				if(method.getName().equals(methodName)) {
					
				
					
					//if our method name matched with the class method name now its time to collect the parameter in Parametter[]
					Parameter[] parameters = method.getParameters();
					
					//take arguments  from users too & store it in Object[]
					Object[] arguments = new Object[parameters.length];
					
					for(int index  = 0; index<parameters.length; index++) {
						
						//get parameter for each type present in Parameter[]
						String parameterType = parameters[index].getType().getName();
						
						//get paramater value form user
						System.out.println("Enter a parameter vaue"+parameters[index]+" :");
						arguments[index]= Convert.change(parameterType, sc.nextLine());
						System.out.println(arguments[index]);
						
					}//close for loop for taking value from user//
					
					//creating new instabce
					
					Object reference  = classNameRef.newInstance();
					//System.out.println(reference);
					//method.setAccessible(true);
					Object resul =  method.invoke(reference, arguments);
					//System.out.println(resul);
					//break;
				}//close if to check method is equals or not
			}//close for loop for method[]
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
			  catch (InvocationTargetException e) { // TODO Auto-generated catch block
			  e.printStackTrace(); }
			 
	}

}
