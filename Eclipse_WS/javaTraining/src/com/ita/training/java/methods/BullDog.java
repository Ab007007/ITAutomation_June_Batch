package com.ita.training.java.methods;

public class BullDog extends Dog 
{


	@Override
	public void WhoAmI() {
		System.out.println("i'm a BullDog");
	}
	public static void main(String[] args) {
		
		BullDog bd = new BullDog();
		bd.WhoAmI();
		bd.whichFamily();
				
	}
}
