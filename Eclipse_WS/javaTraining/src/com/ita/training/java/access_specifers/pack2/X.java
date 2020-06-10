package com.ita.training.java.access_specifers.pack2;

import com.ita.training.java.access_specifers.pack1.A;

public class X {

	
	public static void main(String[] args) {
		
		A a1 = new A();
		System.out.println("Default member of Class A -> " + a1.publicVariable);
		
		a1.publicVariable = 200;
		System.out.println("after changing " + a1.publicVariable);
		
		a1.test4();
		
	}
}
