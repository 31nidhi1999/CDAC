class SubStringPer{

	static void display(String str, String res){
			if(str.length() ==0){
				System.out.println("terminate conn"+str);
			return;
	}
	
		for(int  i =0; i < str.length();i++){
			char ch = str.charAt(i);
			System.out.println(ch);
			String ros = str.substring(0,i) + str.substring(i+1);
			System.out.println("ros "+str);
			display(ros,res+ch);
		}
	}
	
	public static void main(String[] args){
		String str = "Nidhi";
		display(str,"ABC");
	}
	
}