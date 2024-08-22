class PassFailed{
	public static void main(String [] agr){
		int sub1 = 35;
		int sub2 = 39;
		int sub3 = 33;
		
		int subFails=0;
		
		if(sub1>40 && sub2 >40 && sub3>40){
			subFails = 0;
		}else if(sub1<=40 || sub2<=40 || sub3<=40){
			if(sub1<=40){
				subFails++;
			}
			if(sub2<=40){
				subFails++;
			}
			if(sub3<=40){
				subFails++;
			}
		}
		
		switch(subFails){
			case 0:
				System.out.println("Student passsed in all subjects");
				break;
			case 1:
				System.out.println("Student failed in 1 subjects");
				break;
			case 2:
				System.out.println("Student failed in 2 subjects");
				break;
			case 3:
				System.out.println("Student failed in 3 subjects");
				break;
			
				
				  
		}
	}
}