package demo1;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
			
		Employee[] arr = Helper.getEmpInstance();
		 
		 Arrays.sort(arr);
		 
		 Helper.printRecord(arr);
	}

}
