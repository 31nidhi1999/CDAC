package org.example.demo;

public class Person {
	String name;
	int age;
	
	public Person() {
		this(null,0);
	}
	
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name+" "+this.age;
	}
}
