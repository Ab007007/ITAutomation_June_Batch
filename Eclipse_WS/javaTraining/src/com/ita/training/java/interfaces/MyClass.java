package com.ita.training.java.interfaces;

public class MyClass extends Test3 implements Test1, Test2 
{

	@Override
	public void test2() {
		System.out.println(MAX_MARKS);
		
	}

	@Override
	public void test1() {
		System.out.println(MAX_MARKS);
		
	}
	
	public static void main(String[] args) {
		MyClass m = new MyClass();
		m.test1();
		m.test2();
		m.test3();
				
	}

}
