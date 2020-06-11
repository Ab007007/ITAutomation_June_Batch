package com.ita.training.java.blocks;

public class InstanceInitBlockDemo {
	
	static int count=0;
	
	{
		System.out.println("Total Viewers  now - " + ++count);
	}
	
	public InstanceInitBlockDemo() {
		System.out.println("Constructor called");
	}
	
	
	public static void main(String[] args) {
		InstanceInitBlockDemo it1 = new InstanceInitBlockDemo();
		InstanceInitBlockDemo it2 = new InstanceInitBlockDemo();
		InstanceInitBlockDemo it3 = new InstanceInitBlockDemo();
		InstanceInitBlockDemo it4 = new InstanceInitBlockDemo();
		InstanceInitBlockDemo it5 = new InstanceInitBlockDemo();
		InstanceInitBlockDemo it6 = new InstanceInitBlockDemo();
		InstanceInitBlockDemo it7 = new InstanceInitBlockDemo();
		InstanceInitBlockDemo it8 = new InstanceInitBlockDemo();
		InstanceInitBlockDemo it9 = new InstanceInitBlockDemo();
		InstanceInitBlockDemo it10 = new InstanceInitBlockDemo();
		
		
	}

}
