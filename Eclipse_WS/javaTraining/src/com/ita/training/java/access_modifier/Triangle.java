package com.ita.training.java.access_modifier;

public class Triangle extends Geometry 
{

	
	void area() {
		System.out.println("Area of a Trianale");
		
	}
	
	
	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		t1.area();
	
	}
}
