/*
 *
 Underweight: BMI less than 18.5
Normal weight: BMI of 18.5 to 24.9
Overweight: BMI of 25 to 29.9
Obesity: BMI of 30 or higher*/

package assigment2;

import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a weight in Kg :");
		float weight = sc.nextFloat();

		System.out.println("Enter a height in cm:");
		float height = sc.nextFloat();

		float bmiCal = weight/(height/100 * height/100);

		System.out.println(bmiCal);

		if (bmiCal<18.5) {
			System.out.println("Underweight");
		}else if(bmiCal>=18.5 && bmiCal<24.9) {
			System.out.println("Normal wieght");
		}else if(bmiCal>=25 && bmiCal<29.9) {
			System.out.println("Overweight");
		}else if(bmiCal>30) {
			System.out.println("Obesity");
		}
	}

}
