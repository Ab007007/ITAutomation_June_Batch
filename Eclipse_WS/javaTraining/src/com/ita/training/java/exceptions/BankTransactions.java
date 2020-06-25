package com.ita.training.java.exceptions;

import java.util.Scanner;

public class BankTransactions {

	static double balance = 5000;
	static Scanner sc = null;
	static int withdraw = 0;
	static double tempbalance = 0;
	static String choice = "no";
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		do {
			System.out.println("Select the operation to perform ");
			System.out.println("1. Credit\n2. Debit\n3. show balance\n4. Show Personal info");
			int selection = sc.nextInt();
			
			switch (selection) 
			{
			case 1:
					credit();
				
				break;
			case 2:
					debit();
				break;
			case 3:
					balance();
					break;

			default:
				break;
			}
			
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

	public static void credit()
	{
		System.out.println("Please enter the amount to credit");
		int creditamount = sc.nextInt();
		if(creditamount >=0)
		{
			balance = balance + creditamount;
			System.out.println("amount " + creditamount + " is added to your account, your current balance is " + balance);
		}
		else
		{
			System.out.println("Please, enter positive number");
		}
	}
	
	public static void balance()
	{
		System.out.println("your current balance is "  + balance);
	}



}
