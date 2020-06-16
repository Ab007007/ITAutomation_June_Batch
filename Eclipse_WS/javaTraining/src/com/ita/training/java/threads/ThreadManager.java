package com.ita.training.java.threads;

public class ThreadManager {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("---- With threads ----");
		OddNumbers od = new OddNumbers();
		EvenNumber ev = new EvenNumber();
		
		od.start();
		ev.start();
		
		for (int i = 1; i < 50; i++) 
		{
			System.out.println("##########------------" + i);
			Thread.sleep(100);
		}

		
	}
}
