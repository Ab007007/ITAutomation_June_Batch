package com.ita.training.java.blocks;

public class StaticInitBlockDemo 
{
	
	
	public static void main(String[] args) {
		System.out.println("main Strted");
		
		
		
		
		System.out.println("main ended");
	}

	
	static 
	{
		System.out.println("I'm executing before Main");
	}
	
	
}
