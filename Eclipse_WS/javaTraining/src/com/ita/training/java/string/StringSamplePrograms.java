package com.ita.training.java.string;

import java.util.Date;

public class StringSamplePrograms 
{

	
	public static void main(String[] args)
	{
		
		Date d = new Date();
		System.out.println(d.toString());
	}
	
	/**
	 * this is a function to validate a given string is palindrome or not
	 * @param str
	 */
	public static void palidndrome(String str)
	{
		// Reverse the given string and store it in a variable 
		String revStr = reverseString(str); 
		
		// Compare the string passed by user with reverse string 
		//If same print palindrome else not
		if (str.equalsIgnoreCase(revStr)) {
			System.out.println("Given String is Palindrome");
		}
		else{
			System.out.println("Given String is not a Palindrome");
		}
	}
	
	/**
	 * replace all char 
	 * @param str -  given string 
	 * @param from - character / string to replace
	 * @param to - character / string to be replaced
	 */
	public static void replaceAllChar(String str, String from, String to)
	{
		// bultin function replaceAll is called 
		str = str.replaceAll(from,to);
		System.out.println(str);
	}
	public static void reverseUsingSB(String str)
	{
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
	}
	public static String reverseString(String str)
	{
		String revStr = "";
		System.out.println("-------------------------------------------------");
		System.out.println(str);
		for (int i = str.length()-1; i >= 0; i--) 
		{
			revStr = revStr + str.charAt(i);
		}
		System.out.println(revStr);
		System.out.println("-------------------------------------------------");
		return revStr;
	}
}
