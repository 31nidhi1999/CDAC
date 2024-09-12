package in.cdac.p2;

import in.cdac.p1.classA;

public class classD extends classA {
	public void fun4() {
		//System.out.println("classB Num1 :"+this.num1);  //classA.num1 is not viisble
		//System.out.println("classD Num2 :"+this.num2);    //classA.num1 is not viisble
		System.out.println("classD Num3 :"+this.num3);
		System.out.println("classD Num4 :"+this.num4);
	}
}
