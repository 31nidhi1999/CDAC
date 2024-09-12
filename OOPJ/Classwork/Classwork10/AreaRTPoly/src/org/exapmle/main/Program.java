package org.exapmle.main;
import org.exapmle.domain.Circle;
import org.exapmle.domain.Rectangle;
import org.exapmle.util.AreaUtil;
import org.exapmle.util.ChosseShape;


public class Program {
	
	public static void main(String[] args) {
		AreaUtil au = new AreaUtil();
		ChosseShape choice;
		
		
		while((choice=AreaUtil.MenuList())!=ChosseShape.EXIT) {
			switch (choice) {
			case RECTANGLE: 
				au.setInstance(new Rectangle());
				break;
			case CIRCLE:
				au.setInstance(new Circle());
				break;
			}
		}
	}

}
