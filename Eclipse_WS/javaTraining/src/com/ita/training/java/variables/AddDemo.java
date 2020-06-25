package com.ita.training.java.variables;

public class AddDemo {

	static int c;
	static int add() 
	{
		System.out.println("Adding number");
		return 0;
	}
	
	static int add(int a1 , int b1) 
	{
		System.out.println("Adding number");
		c = a1 + b1;
		return c;
	}
	
	
	public static void main(String[] args) {
		
		int a = add(2,3);
		System.out.println(a);
		System.out.println(c);
	}
}
