class Recurssion{
	
	static int show(int n){
		
		if(n<=1)
			return n;
		return n + show(n -1);
		
	}
	
}

public class DirectRecussion{
	public static void main(String[] agrs){
		
		System.out.println(Recurssion.show(10));
		
	}
}