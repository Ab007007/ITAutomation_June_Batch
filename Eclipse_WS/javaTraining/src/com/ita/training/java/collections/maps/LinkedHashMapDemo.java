package com.ita.training.java.collections.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo {

	public static void main(String[] args) {

		List al = new ArrayList();
		al.add("Aravinda");
		al.add("Bangalore");
		al.add("9955887788558");

		Map mp = new HashMap();
		mp.put("Name", "Aravinda");
		mp.put("A-Details", al);
		mp.put("Address", "adsfasdf asdfasdf");

		System.out.println(mp.get("Name"));
		System.out.println(mp.get("A-Details"));
		System.out.println(mp.size());
		
		printMaps(mp);
		
		if(mp.get("Name") ==null)
		{
			mp.put("Name","Ravi");
		}
		else
		{
			System.out.println("please select different key");
		}
		printMaps(mp);
		
		
	}

	public static void printMaps(Map mp1) {
		System.out.println("Printing collection ----------");
		Set keys = mp1.keySet();

		Iterator it = keys.iterator();
		Object key = null;
		while (it.hasNext()) {
			key = it.next();
			System.out.println(key + " : " + mp1.get(key));
		}

	}
}
