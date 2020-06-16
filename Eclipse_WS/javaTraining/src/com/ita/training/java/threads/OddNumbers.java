package com.ita.training.java.threads;

public class OddNumbers extends Thread
{
	
	public void run() {
		System.out.println("---- Odd Numbers ----");
		for (int i = 1; i < 50; i=i+2) 
		{
			System.out.println("OOOOOOOOOOOO----------" + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
