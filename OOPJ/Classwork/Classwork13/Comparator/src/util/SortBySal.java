package util;

import java.util.Comparator;

import employee.Employee;

public class SortBySal implements Comparator<Employee> {
	 @Override
	public int compare(Employee o1, Employee o2) {
		
		return (int) (o1.getSalary() - o2.getSalary());
	}

}
