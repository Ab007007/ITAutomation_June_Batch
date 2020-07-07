package com.ita.training.java.interfaces;

public class AnnonimusInnerClassDemo {
	
	public static void main(String[] args) {
		
		
		Test1 t1 = new Test1()
		{
			
			@Override
			public void test1() {
				System.out.println("annonimus");
				
			}
		};
		
		
		t1.test1();
	}

}
