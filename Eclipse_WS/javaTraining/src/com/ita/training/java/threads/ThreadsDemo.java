package com.ita.training.java.threads;

public class ThreadsDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("---- without threads ----");
		
		for (int i = 1; i < 50; i++) 
		{
			System.out.println(i);
			Thread.sleep(100);
		}
		
		System.out.println("---- Odd Numbers ----");
		for (int i = 1; i < 50; i=i+2) 
		{
			System.out.println(i);
			Thread.sleep(100);
		}
		
		System.out.println("---- Even Numbers ----");
		for (int i = 0; i < 50; i=i+2) 
		{
			System.out.println(i);
			Thread.sleep(100);
		}
		
	}
}
