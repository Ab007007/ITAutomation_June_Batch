package com.ita.training.java.exceptions;

public class ExceptionsDemo {

	public static void main(String[] args) {
		
		System.out.println("-- main started --");
		try
		{
		mySleep1(2000);
		}
		catch(InterruptedException ex)
		{
			System.out.println("Exception occured");
		}
		System.out.println("-- main ended --");
	}

	public static void mySleep1(int ms) throws InterruptedException {
		Thread.sleep(ms);
	}

	public static void mySleep2(int ms) {
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
