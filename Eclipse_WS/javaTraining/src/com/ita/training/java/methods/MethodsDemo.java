package com.ita.training.java.methods;

public class MethodsDemo {

	
	/*
	 * Methods describes the Behavior of an Object
	 * reusable entities - you write once and use it many times
	 * 
	 * Syntax :
	 * [access specifiers] [access modifiers] return_type name_of_method([arguments list])
	 * {
	 * 
	 * 
	 * }
	 * 
	 * return_type - can be void OR any data_type
	 * if the return_type is other than void - last statement in your method should be
	 * return statement
	 * 
	 * 
	 * 1. Methods without return type and with out arguments
	 * 2. Methods without return type and with arguments
	 * 3. Methods with return type and with arguments
	 */

	void test()
	{
		System.out.println("My first Method!!!");
	}
	
	public static void main(String[] args) 
	{
		MethodsDemo obj1 = new MethodsDemo();
		obj1.test();
		System.out.println("main is ended!!!");
		
		
	}
	

}
