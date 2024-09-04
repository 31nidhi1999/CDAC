package assigment2;

import java.util.Scanner;

public class CalArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the shape of your choice :");
		String shape = sc.next();
		
		switch (shape) {
		case "Circle":
			
			System.out.println("Enter the radiis of the Circle :");
			int r = sc.nextInt();
			
			System.out.println("Circle Area :" + 3.14*r*r);
			break;
			
		case "Rectangle":
			
			System.out.println("Enetr the rectangle length :");
			int lenght=sc.nextInt();
			
			
			System.out.println("Enter the breath lenght :");
			int breath = sc.nextInt();
			
			System.out.println("Area of rectangle :" + lenght*breath);
			break;
			
		case "Square" :
			
			System.out.println("Enter a side of sqaure :");
			int s = sc.nextInt();
			
			System.out.println("Area of Sqaure :"+ s*s);
			break;
		
		case "Triangle":
			 
			System.out.println("Enter a height of triangle :");
			int height = sc.nextInt();
			
			System.out.println("Enter a base of triangle :");
			int base = sc.nextInt();
			
			System.out.println("Area of triangle : " + 0.5*height*base);
			break;
		default:
			System.out.println("Enter a predefined shape leike Sqare,Circle,Rectangle,Triangle shape");
		}

	}

}
