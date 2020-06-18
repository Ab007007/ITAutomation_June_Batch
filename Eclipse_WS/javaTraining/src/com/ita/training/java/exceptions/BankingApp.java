package com.ita.training.java.exceptions;

import java.util.Scanner;

public class BankingApp {

	static double balance = 5000;
	static Scanner sc = null;
	static int withdraw = 0;
	static double tempbalance = 0;
	static String choice = "no";
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		do {
			debit();
			System.out.println("Do you want to continue ...? yes/no");
			choice = sc.next();
		}while(choice.equalsIgnoreCase("yes"));
			
		System.out.println("BYE BYE!");
	}
	
	public static void debit()
	{
		System.out.println("Enter the amount you want to withdraw");
		withdraw = sc.nextInt();
		tempbalance = balance - withdraw;
		if(tempbalance <= 0)
		{
			try 
			{
				throw new BalanceInsufficientException(balance);
			} 
			catch (Exception e) {
				System.out.println("Handling Exception");
			}
			finally {
				System.out.println("finally executed");
			}
		}
		else
		{
			balance = tempbalance;
		}
		System.out.println("current balance - " + (int)balance);
	}
}
