package com.ita.training.java.loops;

public class ForLoopDemo {
	
	public static void main(String[] args) {
		int number = 15;
		
		System.out.println("---Printing a table for " + number + " ---");
		for (int i = 1 ; i <= 10; i++) //i++ => i = i +1
		{
			System.out.println(number + " * " + i + " = " + number*i);
		}
		
		
		System.out.println("--- Tables in Reverse Order ---");
		for(int i = 10;i >=1; i--)
		{
			System.out.println(number + " * " + i + " = " + number*i);
		}
		
		System.out.println("---Thanks for using loop ---");
	}

}
