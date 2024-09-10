
public class Logger {

	private static Logger logger;
	private static int count;
	private int a,b;
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	
	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public static  Logger getIntance() {
		if(logger == null) {
			logger = new Logger();
			count++;
		}
		count++;
		return logger;
	}
	
	public static int getCounter() {
		return count;
	}
	
	
	
	public static void main(String[] args) {
		
		Logger l1 = logger.getIntance();
		l1.setB(10);
		l1.setA(20);
 
		System.out.println(l1.getA());
		System.out.println(l1.getB());
		
		
			
	}

}
