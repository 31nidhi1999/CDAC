package gc;

class FirstCls {
	SecondCls s;

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Garbage collection is initilized for SecondCls ");
	}
}

class SecondCls {
	FirstCls f;

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Garbage collection is initilized for FirstCls ");
	}

}

class Demo {

	String name;

	public Demo(String name) {
		this.name = name;
	}

	/*
	 * Called by the garbage collector on an object when garbage collection
	 * determines that there are no more references to the object.
	 */
	@Override
	protected void finalize() {
		System.out.println("The garbage collection is called by :: " + this.name);

	}
}

public class GarbageCollection {

	// local variable
	public static void abc() {
		Demo d4 = new Demo("Sumitra");
	}

	public static void main(String[] args) {

		System.out.println("Inside main method");

		Demo d1 = new Demo("Nidhi");

		Demo d2 = new Demo("Sunita");

		//Reassigning reference variable
		d1 = d2;
		Demo d3 = new Demo("Devanna");
		d3 = d1;
		
		//Nullify the referencer variable
		d2 = null;

		// Anonymous
		new Demo("Keshva");
		abc();

		// iscalted of isolation
		FirstCls fobj = new FirstCls();
		SecondCls sonbj = new SecondCls();

		
		  fobj.s=sonbj; 
		  sonbj.f=fobj;
		 

		System.gc();

		// Runtime.getRuntime().gc();
		System.out.println("end");
	}

}
