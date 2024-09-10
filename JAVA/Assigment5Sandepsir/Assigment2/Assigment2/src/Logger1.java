

public class Logger1 {

	private String msg;
	
	/*user default contr*/
	public Logger1() {
		// TODO Auto-generated constructor stub
	}
	
	/**Single ton*/
	private static Logger1 logger;
	public static Logger1 getInstance() {
			if(logger == null) {
				logger = new Logger1();
			}
			return logger;
	}

	/*gette setter*/
	public String getLog() {
		return msg;
	}
	public void log(String msg) {
		this.msg = msg;
	}
	public void clearLog() {
		msg="";
	}
	
	

}
