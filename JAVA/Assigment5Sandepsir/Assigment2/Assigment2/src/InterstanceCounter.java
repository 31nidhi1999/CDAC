
public class InterstanceCounter {
	
	private static int  count;

	public InterstanceCounter() {
		// TODO Auto-generated constructor stub
		count++;
	}
	
	/*tostring*/
	@Override
	public String toString() {
		return "";
	}
	
	/*setter and getter*/
	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		InterstanceCounter.count = count;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterstanceCounter ic = new InterstanceCounter();
		System.out.println("Interstance Counter :" + getCount());
		
		InterstanceCounter ic1 = new InterstanceCounter();
		System.out.println("Interstance Counter :" + getCount());
		
		
		InterstanceCounter ic2 = new InterstanceCounter();
		System.out.println("Interstance Counter :" + getCount());
		
		
		InterstanceCounter ic3 = new InterstanceCounter();
		System.out.println("Interstance Counter :" + getCount());
		
		
		InterstanceCounter ic4 = new InterstanceCounter();
		System.out.println("Interstance Counter :" + getCount());
		
		
		InterstanceCounter ic5 = new InterstanceCounter();
		System.out.println("Interstance Counter :" + getCount());
		
		
	}

}
