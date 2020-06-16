package com.ita.training.java.conditional;

public class TirnaryOperator {

	public static void main(String[] args) {
		int a = 15;
		int b = 60;
		//(condition)?Statement1:Statement2;
		
		String c = (a>b)?"First Number is greater":"Second Number is greater";
		
		System.out.println(c);
	}
}
