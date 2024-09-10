
public class program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Logger1.getInstance());
		Logger1 refLogger = Logger1.getInstance();
		
		refLogger.log("Hello Nidhi to logger class.....");
		System.out.println(refLogger.getLog());
		refLogger.clearLog();
		System.out.println(refLogger.getLog());
		refLogger.log("Hello eveyonr to logger class.....");
		System.out.println(refLogger.getLog());
		
	}

}
