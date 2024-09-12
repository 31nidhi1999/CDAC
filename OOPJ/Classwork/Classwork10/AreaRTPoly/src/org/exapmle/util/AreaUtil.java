package org.exapmle.util;

import java.util.Scanner;

import org.exapmle.domain.Area;
import org.exapmle.domain.Circle;
import org.exapmle.domain.Rectangle;

public class AreaUtil {
	private static Scanner sc = new Scanner(System.in);
	private Area area;
	
	public void setInstance(Area area){
		if(area instanceof Rectangle) {
			
			Rectangle rect = new Rectangle();
			
			System.out.println("Enter the length of rectangle :");
			rect.setLength(sc.nextInt());
			System.out.println("Enter te breath of recatngle :");
			rect.setBreath(sc.nextInt());
			rect.calArea();
			System.out.println(rect.getArea());
		}else {
			Circle c = new Circle();
			
			System.out.println("Enter the radius of circle");
			c.setRadius(sc.nextInt());
			c.calArea();
			System.out.println(c.getArea());
		}
	}
	
	public static ChosseShape MenuList() {
		System.out.println("0.EXIT");
		System.out.println("1.RECTANGLE");
		System.out.println("2.CIRCLE");
		System.out.print("Enter a number :");
		return ChosseShape.values()[sc.nextInt()];
	}

}
