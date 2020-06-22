package com.ita.training.java.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args)
	{
		List al =  new ArrayList();
		List al2 = new ArrayList();
		al2.add("one");
		al2.add("one");
		al2.add("one");
		al2.add(null);
		
		al.add(123);
		al.add("Aravinda");
		al.add(23.223);
		al.add(true);
		al.add('A');
		printCollection(al);
		
		System.out.println("_---- Insert Elements at 0 and last index ---");
		
		al.add(0,"New element");
		al.add("New elemente at last index");
		printCollection(al);
		
		System.out.println("--- Delete the element from the index 1 ---");
		al.remove(0);
		al.remove("Aravinda");
		printCollection(al);
		
		System.out.println("--- store collection inside a collectionv--- ");
		al.add(al2);
		printCollection(al);
		
		/*
		 * // Print with basic for loop.
		 * 
		 * for(int i=0;i<al.size();i++) { System.out.println(al.get(i)); }
		 * 
		 * System.out.println("--- Printing using for each ---"); for (Object value :
		 * al) { System.out.println(value); }
		 */
		
		
		
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
