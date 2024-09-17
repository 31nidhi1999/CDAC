/**
 * Lambda with body contain return statement.
 * Lambda without body doesn't required retrun statement
 * 
 * */

package demo1;

interface Imath{
	double sum(double num1,float num2,int num3);
}

public class LambdawithBody {

	public static void main1(String[] args) {
		
		
		/**giving datatype to parameter is optional we have seen in OneParameterLambda too*/
		Imath im = ( num1, num2, num3)->{
			return num1 + num2+num3;
		};

		double result = im.sum(20.0,30.2f,25);
		System.out.println(result);

	}
	
	public static void main(String[] args) {


		/** without return type*/
		Imath im = ( num1, num2, num3)-> num1+num2+num3;

		double result = im.sum(20.0,30.2f,25);
		System.out.println(result);

	}

}
