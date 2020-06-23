package com.ita.training.java.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo 
{
	
	public static void main(String[] args) 
	{
		Set set =  new HashSet();
		set.add(123);
		set.add(456);
		set.add("pqr");
		set.add(123);
		set.add("abc");
		set.add("pqr");
		printSet(set);
		
		set.remove(123);
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
