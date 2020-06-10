package com.ita.training.java.access_modifier;
/*
 * 1. You can write as many classes as you want in a same file
 * 2. You should have only one public class in one file
 * 3. File name should be same as the class name which contain main method
 * 4. main method should be present inside the public class only
 *   
 */

class Person {
	String name;
	static String country = "India";
	
	final static String livesOn = "Earth";
	
	
	static void test()
	{
		System.out.println("Hello person!!!! lives on " + livesOn);
	}
	
	
}



public class PersonManager {
	
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.name = "Aravinda";
		p2.name = "Ravi";
		p1.country = "USA";
		
		System.out.println(p1.name);
	//	System.out.println(p1.country);
		System.out.println(Person.country);
		
		System.out.println("------------------------------Person2-------------");
		System.out.println(p2.name);
		System.out.println(p2.country);
		
		Person.test();
	
		
		
	}

}
