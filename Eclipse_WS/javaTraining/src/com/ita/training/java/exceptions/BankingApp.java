package com.ita.training.java.exceptions;

public class BankingApp {

	static double balance = 5000;
	
	public static void main(String[] args) {
		
		System.out.println("Enter the amount you want to withdraw");
		
		int withdraw = 5090;
		double tempbalance = 0;
		
		
		tempbalance = balance - withdraw;
		if(tempbalance <= 0)
		{
			try 
			{
				throw new Exception();
			} 
			catch (Exception e) {
				System.out.println("your balance is too low to make this transaction ,"
						+ "Please withdraw with in " + balance);
			}
			finally {
				System.out.println("finally executed");
			}
		}
		
		System.out.println("current balance" + balance);
				
		
	}
}
