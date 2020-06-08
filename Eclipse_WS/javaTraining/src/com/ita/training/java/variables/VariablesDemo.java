package com.ita.training.java.variables;

import javax.sound.midi.Soundbank;

/*
 * Variable - any name which hold the value
 * 
 * Syntax -
 * 
 *  data_type variable_name = <<VALUE>>
 *  
 *  DATA_TYPE : 
 *  Type of data that you can store in a variable. (SIZE)
 *  1. PDT - 
 *  	boolean - 
 *  , char, byte,short, int, long, float, double
 *  2. DDT - Classes, Objects, Arrays
 *  
 */

/*
 * int number; number = 10;
 */
public class VariablesDemo 
{
	static String country = "INDIA";
	
	public static void main(String[] args)
	{
		
		String name = "Aravinda";
		int age = 35;
		double weight  = 75;
		double height  = 5.7;
		long phoneNum = 9945042504L;
		
		System.out.println("----------------Person Details are-----------");
		System.out.println("Name - " + name);
		System.out.println("Age - " + age);
		System.out.println("Weight - " + weight);
		System.out.println("Height - " + height);
		System.out.println("PhoneNumber - " + phoneNum);
		System.out.println("Country " + country);
		System.out.println("----------------------------------------------");
		test();
		System.out.println("ENDDDDDDDDDDDDDDDDDDDDDDDD");
	}
	
	/*
	 * [access_specifiers] [access_modifiers]  return_type name_of_method([Arguments])
	 * {
	 * *****
	 * } 
	 */
	
	
	public static void test()
	{
		System.out.println("Accessing Global Variable " + country);
	}
}
