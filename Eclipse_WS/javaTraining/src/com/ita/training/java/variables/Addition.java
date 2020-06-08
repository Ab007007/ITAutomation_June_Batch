package com.ita.training.java.variables;

public class Addition {
	static int c;
	
	public static void main(String[] args) {
		
		System.out.println("--- welcome to Addition of two numbers ---");
		//declaration
		int a,b;
		
		//store values
		a = 10;
		b = 20;
		
		c = a + b;
		//System.out.println("Sum of two numbers is " + c);
		printResult();
		c = a -b;
		//System.out.println("Sub of two numbers is " + c);
		printResult();
		
		a = 40;
		b = 50;
		c = a + b;
		//System.out.println("Sum of two numbers is " + c);
		printResult();
	}
	
	static void printResult()
	{
		System.out.println("Result after operation " + c);
	}

}
