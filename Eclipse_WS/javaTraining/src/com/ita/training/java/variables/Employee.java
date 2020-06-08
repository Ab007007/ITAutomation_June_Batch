package com.ita.training.java.variables;

public class Employee {

	//Global Variables - Instance(Object) Variables
	String name;
	int age;
	String empID;
	boolean currentEmployeeStatus;
	String homeAddress;
	String companyAddress;
	//static variable
	static String companyName = "Wipro";
	String country = "INDIA";
	//constant
	static final String policy = "ALL EMPLOYEE SHOULD GET MEDICAL INSURENCE FOR THE ENTIRE FAMILY";
	
	
	public static void main(String[] args) 
	{
		Employee employee1 = new Employee();
		Employee employee2 = new Employee();
		Employee employee3 = new Employee();
		Employee employee4 = new Employee();
		Employee employee5 = new Employee();
		Employee employee6 = new Employee();
		employee1.name = "Aravinda HB";
		employee1.age = 30;
		employee1.empID = "EMP007";
		employee1.currentEmployeeStatus = true;
		employee1.homeAddress = "ABCD XYZ - 568899";
		employee1.companyAddress = "QQQ WWW EEE  - 556699";
		//employee1.policy = "NO POLICY";
				
		System.out.println(employee1.policy);
		
		
	}
}
