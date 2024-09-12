package org.exapmle.domain;

public class Circle extends Area {
	private int radius;
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	@Override
	public void calArea() {
		this.area = Math.PI * Math.pow(radius, 2);
	}
}
