/**
 * problem faces in generic 
 * */

package demo2;

import java.util.Date;

class Box{
	private Object obj;
	
	public void setObj(Object obj) {
		this.obj = obj;
	}
	
	public Object getObj() {
		return obj;
	}
}

public class Program2 {

	public static void main(String[] args) {
		Box box  = new Box();
		Date dt  = new Date(); //	upcasting	
		box.setObj(dt);
		Object obj = box.getObj();
		/**gives ClasscastException because the Object obj is initialized with Date instance
		this is RTE (unchecked exception) & the problem in generic programming downcasting may cause issue*/
	
		String str = (String)obj;
		System.out.println(str);

	}

}
