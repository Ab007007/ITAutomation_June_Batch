package com.ita.training.java.methods;

public class GeometricOperations {

	public static void main(String[] args) {
		
		//aru03.info@gmail.com
		
		AdditionUsingMethods aObj = new AdditionUsingMethods();
		
		int sum1 = aObj.addition(10, 20);
		System.out.println("Printing from main - with -10 : " + (sum1-10));
		int sum2 = aObj.addition(15, 25);
		System.out.println("Printing from main - with -10 : " + (sum2-10));
		
		aObj.addition(35, 20);
		
		aObj.substraction(20, 10);
		
		aObj.multiplication(15, 5);
		
		aObj.division(25, 5);
		
	}
}
