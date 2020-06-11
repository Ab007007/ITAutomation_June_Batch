package com.ita.training.java.methods;

public class Dog extends Animal
{
	
	public void WhoAmI() {
		System.out.println("I'm a Dog");
	}
	
	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.WhoAmI();
	}
	
	
}
