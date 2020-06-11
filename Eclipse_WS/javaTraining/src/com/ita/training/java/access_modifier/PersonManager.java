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
	double weight;
	int age;
	static String country = "India";
	final static String livesOn = "Earth";
	
	
	static void test()
	{
		System.out.println("Hello person!!!! lives on " + livesOn);
	}
	
	
	public String toString() {
		String str = null;
		str = "The Person class has Name " + this.name + " Weight " + this.weight
				+ " Age " + this.age + " Country " + country + " and lives on " + livesOn ;
		
		return str;
		
	}
}



public class PersonManager {
	
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.name = "Aravinda";
		p1.age = 35;
		p1.weight = 75;
				
		p2.name = "Ravi";
		p2.age = 34;
		p2.weight = 70;
		
		System.out.println(p1);
		System.out.println(p2);
	}

}
