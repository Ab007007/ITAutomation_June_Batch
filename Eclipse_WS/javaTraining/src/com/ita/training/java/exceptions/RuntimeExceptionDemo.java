package com.ita.training.java.exceptions;

public class RuntimeExceptionDemo {

	public static void main(String[] args) {
		int numArray[] = new int[2];
		try {
			numArray[0] = 10;
			numArray[1] = 20;
			numArray[2] = 30;
		} 
		catch (ArrayIndexOutOfBoundsException e) {

				System.out.println("Please dont inserte elements about the size-1");
		}
		System.out.println(numArray[0] + " and " + numArray[1] + " is stored in array");

	}
}
