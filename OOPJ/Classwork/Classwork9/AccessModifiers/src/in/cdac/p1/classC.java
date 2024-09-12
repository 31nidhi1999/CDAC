package in.cdac.p1;

public class classC {
	public void fun3() {
		classA ca = new classA();
		//System.out.println("classB Num1 :"+this.num1); // num1 is not a filed
		System.out.println("classC Num2 :"+ca.num2);  //FILED NOT FOUND
		System.out.println("classC Num3 :"+ca.num3);
		System.out.println("classC Num4 :"+ca.num4);
	}
}
