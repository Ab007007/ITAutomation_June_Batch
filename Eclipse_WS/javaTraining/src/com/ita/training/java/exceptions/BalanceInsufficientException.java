package com.ita.training.java.exceptions;

public class BalanceInsufficientException extends Exception
{
	
	public BalanceInsufficientException() 
	{
		System.out.println("Insufficient Funds in your account");
	}

	public BalanceInsufficientException(double balance)
	{
		System.out.println("Your current balance is " + balance + " Please transact within that");
		
	}
	
	
}
