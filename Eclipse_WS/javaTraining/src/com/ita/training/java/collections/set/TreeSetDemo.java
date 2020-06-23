package com.ita.training.java.collections.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo 
{
	
	public static void main(String[] args) 
	{
		Set set =  new TreeSet();
		set.add(123);
		set.add(456);
		set.add(789);
		set.add(555);
		set.add(444);
		set.add(111);
		
		printSet(set);
	}
	
	public static void printSet(Set set)
	{
		System.out.println(set.size());
		
		Iterator it = set.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
