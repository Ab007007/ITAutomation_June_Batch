package com.ita.training.java.wrapperclasses;

public class WrapperClassDemo {

	public static void main(String[] args) {
		
		String str = "5";
		int a = 10;
		
		Integer it = new Integer(str);
		it.valueOf(str);
		
		int c = it + a;
		System.out.println(c);
		
		String str1 = new String();
		str1 = str1.valueOf(a);
		
		System.out.println(str1 + str);
	}
}
