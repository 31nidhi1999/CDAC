/**
 *  Generic come into picture in Java 5
 *  Before Generic, we developer do generic programming  with the help of java.lang.Object
 *  
 *  in the below example we will use primitive Datatype & convert into corresponding wrapper class
 *  later we will upcasting
 *  
 *  we can't pass Primitive Datatype as generic argument
 * */

package demo1;

class Box{
	private Object obj;
	
	public void setObj(Object obj) {
		this.obj = obj;
	}
	
	public Object getObj() {
		return obj;
	}
}

public class Program1 {
	
	public static void main1(String[] args) {
		
		Box box = new Box();
		boolean b1 = true;
		//AutoBoxing compiler Boolean.valueOf(b1) & then upcasting
		box.setObj(b1);
		
		//we getting obj reference hence we stored the obj ref in main method LV of reference Type Object
		Object obj = box.getObj();
		
		//dpwnacasting
		Boolean b =(Boolean) obj;
		
		System.out.println(b);
		
	}
	
	public static void main(String[] args) {
		
		Box box = new Box();
		
		int  i = 10;
		box.setObj(i); //AutoBoxing compiler Integer.valueOf(i) & then upcasting
		
		//we getting obj reference hence we stored the obj ref in main method LV of reference Type Object
		Object obj = box.getObj();
		
		//downcasting using type casting
		Integer integer = (Integer)obj;
		
		System.out.println(integer);
	}
}
