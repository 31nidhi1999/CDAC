package util;

import employee.Employee;

public class Helper {
	
	/*AArray interface*/
	public static Employee[] getEmpInstance() {
		Employee[] arr = new Employee[5];
		arr[0]=new Employee("Devanna",102,450000);
		arr[1]=new Employee("Nidhi",101,250111);
		arr[2]=new Employee("Sumitra",104,45425);
		arr[3]=new Employee("Sunita",103,5045450);
		arr[4]=new Employee("Kesha",104,78645);

		
		return arr;
	}
	
	public static void printRecord(Employee[] arr) {
		for ( Employee elemet : arr) 
			System.out.println(elemet.toString());
		System.out.println();
	}

}
