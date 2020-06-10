package com.ita.training.java.access_specifers.pack2;

import com.ita.training.java.access_specifers.pack1.A;

public class Z extends A
{

	public static void main(String[] args) {
		
		Z z1 = new Z();
		System.out.println("Protected member of class A " + z1.protectedVariable);
		System.out.println("Public member of class A " + z1.publicVariable);
		
		z1.test3();
		z1.test4();
	}
}
