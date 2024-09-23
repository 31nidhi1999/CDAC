package demo1;

import java.io.Serializable;

public class Student implements Serializable {

	int rollNo;
	String name;
	double marks;
	
	public Student(int id, String name, double mark) {
		this.rollNo=id;
		this.name=name;
		this.marks=mark;
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	 @Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.rollNo +" "+this.name+" "+this.marks;
	}
}
