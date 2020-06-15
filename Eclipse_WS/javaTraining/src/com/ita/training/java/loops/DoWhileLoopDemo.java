package com.ita.training.java.loops;

import java.util.Scanner;

public class DoWhileLoopDemo {

	public static void main(String[] args) {
		
		System.out.println("--- Welcome to Tables Generator -----");
		Scanner sc = new Scanner(System.in);
		int number ;
		String choice="no";
		
		do {
			System.out.println("Enter the number for which you want to gererate tables");
			number = sc.nextInt();
			for (int i = 1 ; i <= 10; i++) //i++ => i = i +1
			{
				System.out.println(number + " * " + i + " = " + number*i);
			}
			
			System.out.println("Do you want to contine???? type yes/no");
			choice = sc.next();
		}while(choice.toLowerCase().equals("yes"));
		
		System.out.println("Thanks for using Tables generator Programme");
			
	}
}
