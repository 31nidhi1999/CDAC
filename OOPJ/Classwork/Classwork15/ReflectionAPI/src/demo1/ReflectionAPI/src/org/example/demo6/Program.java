package org.example.demo6;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Scanner;

class Calculator{
	public int sub( int num1, int num2 ) {
		return num1 -  num2;
	}
	public double sum( int num1, float num2, double num3) {
		return num1 +  num2 + num3;
	}
}
class Convert{
	public static Object changeType(String parameterType, String value) {
		switch( parameterType) {
		case "int":
			return Integer.parseInt(value);
		case "float":
			return Float.parseFloat(value);
		case "double":
			return Double.parseDouble(value);
		}
		return null;
	}
	
}
public class Program {
	public static void main(String[] args) {
		try( Scanner sc = new Scanner(System.in)){
			System.out.print("Enter F.Q.Class Name	:	");
			String className = sc.nextLine();	//org.example.demo6.Calculator
			Class<?> c =  Class.forName(className);
			
			System.out.print("Enter method name	:	");
			String methodName = sc.nextLine();	//sub
			Method[] methods = c.getDeclaredMethods();	//sum, sub
			for (Method method : methods) {
				if( method.getName().equals(methodName)) {
					Parameter[] parameters = method.getParameters();
					Object[] arguments = new Object[ parameters.length ];
					for( int index = 0; index < parameters.length; ++ index ) {
						String parameterType = parameters[ index].getType().getName();
						System.out.print("Enter value for "+parameterType+" parameter	:	");
						arguments[ index ] = Convert.changeType(parameterType ,sc.nextLine());
					}
					Object calculatorReference = c.newInstance(); //Creates a new instance of the class represented by this Class object.
					Object result = method.invoke(calculatorReference, arguments);
					System.out.println("Result	:	"+result);
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
