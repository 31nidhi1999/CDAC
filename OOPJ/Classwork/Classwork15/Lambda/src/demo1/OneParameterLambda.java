/**
* lambda with one paramter can be written in 3 ways
*/

package demo1;

interface Printablle1{
	void print(String str);
}

public class OneParameterLambda {
	
	
	public static void main(String[] args) {
		/**
		 * way3 only valid for single paramter , no writing parameter  ()
		 * */
		Printablle1 p = str->System.out.println("Hi "+str +" Printing from lambda expression");
		p.print("Sunita");
	}
	
	public static void main2(String[] args) {
		/**
		 * way2
		 * also know as type infrenced
		 * */
		Printablle1 p = (str)->System.out.println("Hi "+str +" Printing from lambda expression");
		p.print("Sunita");
	}
	
	
	public static void main1(String[] args) {

		/**way1*/
		Printablle1 p = (String str)->System.out.println("Hi "+str +" Printing from lambda expression");
		p.print("Nidhi");
	}
}
