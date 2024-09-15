package util;

import java.util.Comparator;

import employee.Employee;

public class SortById implements Comparator<Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getEmpid() - o2.getEmpid();
	}

}
