package com.ita.training.java.methods;

public class AdditionUsingMethods {

	/**
	 * Function to add and print the sum of two numbers
	 * @author Aravind
	 * @param a - integer value to be passed
	 * @param b - integer value to be passed
	 * @return - retunrs an integer value which is the sum of two numbers
	 */
	int addition(int a, int b)
	{
		int c;
		c = a + b;
		System.out.println("Sum of two numbers is " + c);
		return c;
		
	}
	
	
	void substraction(int a, int b)
	{
		System.out.println("Substraction of two numbers is " + (a-b));
	}
	
	void multiplication(int a, int b)
	{
		System.out.println("Multiplication of two numbers is " + (a * b));
		
	}

	void division(int a, int b)
	{
		System.out.println("Division of two numbers is " + (a / b));
	}
	
	
	
}
