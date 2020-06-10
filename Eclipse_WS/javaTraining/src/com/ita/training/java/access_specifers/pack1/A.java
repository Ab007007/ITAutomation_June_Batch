package com.ita.training.java.access_specifers.pack1;

public class A {

	private int privateVariable = 0;
	int defaultVariable = 1;
	protected int protectedVariable = 2;
	public int publicVariable = 3;
	
	private void test1() {
		System.out.println("private method");
	}
	
	
	void test2()
	{
		System.out.println("default method");
	}
	
	protected void test3()
	{
		System.out.println("Protected method");
	}
	
	public void test4()
	{
		System.out.println("Publilc member");
	}
	

	
	
	
	
	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println("Default value of Private variable-  " + a1.privateVariable);
		System.out.println("Default value of variable-  " + a1.defaultVariable);
		
		a1.privateVariable = 100;
		System.out.println("Value after Private updated " + a1.privateVariable);
				
		A a2 = new A();
		System.out.println("Default value of Private  variable- " + a2.privateVariable);
		System.out.println("Default value of Private  variable- " + a2.defaultVariable);
		
		a2.privateVariable = 50;
		System.out.println("Value after Private updated " + a2.privateVariable);
		
		
		
		a1.test1();
		a1.test2();
		
		
	}
}
