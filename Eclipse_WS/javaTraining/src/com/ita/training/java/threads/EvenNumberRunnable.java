package com.ita.training.java.threads;

public class EvenNumberRunnable implements Runnable
{

	
	public void run() {
		System.out.println("---- Even Numbers ----");
		for (int i = 0; i < 50; i=i+2) 
		{
			System.out.println("EEEEEEEEEEE----------" + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
	}

}
