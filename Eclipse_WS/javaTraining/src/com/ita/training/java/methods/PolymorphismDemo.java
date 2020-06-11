package com.ita.training.java.methods;

public class PolymorphismDemo {
	
	public static void main(String[] args) {
		add(5,3);
		add(5.5,3.3);
		add("Aravinda " , "HB");
		add(5.3,10);
		//add(true,true);
	}
	
	
	public static void add(int a, int b)
	{
		System.out.println("Sum of two numbers " +a+ " and " + b +" is " + (a+b));
	}

	public static void add(double a, double b)
	{
		System.out.println("Sum of two numbers " +a+ " and " + b +" is " + (a+b));
	}
	
	public static void add(String a, String b)
	{
		System.out.println("Sum of two numbers " +a+ " and " + b +" is " + (a+b));
	}

}
