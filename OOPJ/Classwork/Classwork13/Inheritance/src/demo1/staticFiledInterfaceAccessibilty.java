/**
 * When we  interface A to interface C we have to user extnds kw 
 * 
 * in below code we are going to learn how to access filed(which are implicitly static & final in interface)
 * to its sub class
 * 
 * 
 * We can use helper Interface but it an old proceess (not recomdated)
 * */

package demo1;

interface A2{
	int num1 = 100;
	int num4=400;
	int num5 = 700;
	
	
}

interface B2{
	int num2 = 200;
	int num4=500;
	int num5 = 800;
}

interface C extends A2,B2{
	int num3 = 300;
	int num4=600;
}


public class staticFiledInterfaceAccessibilty {

	public static void main(String[] args) {
		/*we can access interface filed via self interface name or by the sub interface too
		 * by alway safe to use to access filed via Interface name to overcame ambigous problem in Prd project
		 * 
		 * Here num3 is seperate filed & not hiding num1 & num2
		 * */
		System.out.println("Num1 via A "+A2.num1);
		System.out.println("Num2 vai B "+B2.num2);
		System.out.println("Num3 vai C "+C.num3);
		System.out.println("Num1 vai C "+C.num1);
		System.out.println("Num2 vai C"+C.num2);
		System.out.println("Num3 vai C"+C.num3);
		
		/*in below eaample the num4 defined in C infetrface hide the num4 of interface  A & b
		 * to access num4 of A & B we have to access those filed via the interface name */
		System.out.println("\nNum1 "+A2.num4); //400
		System.out.println("Num2 "+B2.num4);  //500
		System.out.println("Num3 "+C.num4);	 //600
		
		
		/*
		 * In beow exapmple we have defined num5 in both A & B but not in C interface
		 * but when we try to access the num5 via C it gives us ambigous error
		 * System.out.println("Num5 "+C.num5); 
		 * System.out.println("Num5 "+C.num5);
		 */

		/*tp overcame above ambigous error we have to access the num5 value via Interface name*/
		System.out.println("\nNum5 via A "+A2.num5); //700
		System.out.println("Num5 vai B "+B2.num5);	//800
		


	}

}
