package com.ita.training.java.string;

public class StringsDemo {

	public static void main(String[] args) {
		
		String str = "abc";
		String str1 = new String("abc");
		
		System.out.println("Value of a String " + str + " and hashcode is " + str.hashCode());
		System.out.println("Value of a String " + str1 + " and hashcode is " + str1.hashCode());
		
		str1 = str1.concat("pqr");
		System.out.println("Value of a String " + str1 + " and hashcode is " + str1.hashCode());

		str1 = str1.concat("123");
		System.out.println("Value of a String " + str1 + " and hashcode is " + str1.hashCode());
		
	}
}
