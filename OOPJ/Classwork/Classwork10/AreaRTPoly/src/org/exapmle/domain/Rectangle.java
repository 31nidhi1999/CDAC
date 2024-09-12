package org.exapmle.domain;

public class Rectangle extends Area {
	private int length;
	private int breath;
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public void setBreath(int breath) {
		this.breath = breath;
	}
	
	@Override
	public void calArea() {
		this.area = this.length * this.breath;
	}

}
