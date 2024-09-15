package main;

import java.util.Arrays;
import java.util.Comparator;

import employee.Employee;
import util.EmpUtil;
import util.Helper;
import util.SORTBY;
import util.SortById;
import util.SortByName;
import util.SortBySal;

public class Main {
    

	public static void main(String[] args) {
		Comparator<Employee> comparator=null;
		SORTBY choice;
		Employee[] arr =Helper.getEmpInstance();
		
		while ((choice=EmpUtil.menuList())!=SORTBY.EXIT) {
			switch (choice) {
			case SORT_BY_NAME: 
				comparator = new SortByName();
				break;
			case SORT_BY_TD:
				comparator = new SortById();
				break;
			case SORT_BY_SALARY:
				comparator = new SortBySal();
			}
			Arrays.sort(arr,comparator);
			Helper.printRecord(arr);
		}

		 

	}

}
