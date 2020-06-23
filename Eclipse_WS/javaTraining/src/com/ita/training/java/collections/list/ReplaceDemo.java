package com.ita.training.java.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ReplaceDemo {

	public static void main(String[] args)
	{
		List al =  new ArrayList();
		
		al.add(123);
		al.add("Aravinda");
		al.add(23.223);
		al.add(true);
		al.add('A');
		printCollection(al);
		
		al.remove(2);
		al.add(2, 100);
		printCollection(al);
		
		
	}
	
	public static void printCollection(List al)
	{
		System.out.println("Collection has " + al.size() + " elements "  +al.isEmpty());
		System.out.println("--- Printing using iterator ---");
		Iterator it = al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	
	
	
	
}
