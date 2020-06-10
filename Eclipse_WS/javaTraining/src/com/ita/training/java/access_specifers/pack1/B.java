package com.ita.training.java.access_specifers.pack1;

public class B {
	
	public static void main(String[] args) {
		A a1 = new A();
	//	System.out.println("Private member of class A -> " + a1.privateVariable);
		System.out.println("Default member of Class A -> " + a1.defaultVariable);
		
		a1.defaultVariable = 200;
		System.out.println("after changing " + a1.defaultVariable);
		
		a1.test2();
		a1.test3();
		a1.test4();
	}

}
