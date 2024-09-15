/*f we want to put restriction on data type which is used as type argument then we should specify
bounded type parameter*/

package demo3;

class Box<N extends Number>{
	private N object;
	
	public void setObject(N object) {
		this.object = object;
	}
	
	public N getObject() {
		return object;
	}
}


public class Program3 {

	public static void main(String[] args) {
		Box<Number> box = new Box<>();
		
		/*
		 * In Box class N parateter Type is bounded to take agrument type(sub class of Number class)
		 * 
		 * Object Obj = new Object(); box.setObject(Obj);
		 * 
		 * box.setObject(Boolean.valueOf(false));
		 */

		box.setObject(Integer.valueOf(100));
		
		box.setObject(Float.valueOf(100.1f));
		
		
	}

}
