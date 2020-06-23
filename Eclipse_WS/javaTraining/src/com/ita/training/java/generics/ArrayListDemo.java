package com.ita.training.java.generics;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();
		for(int i=1;i<=100;i++)
		{
			al.add(15*i);
		}
		
		
		System.out.println(al.size());
		System.out.println("--------- Priniting Values -------------");
		for (Integer value : al) {
			System.out.println(value);
		}
	}

}
