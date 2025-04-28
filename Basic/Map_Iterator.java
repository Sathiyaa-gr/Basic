package Collectionpkg;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_Iterator {

	public static void main(String[] args) {
	
		Map<Integer, String> mp=new HashMap<Integer, String>();
		mp.put(11101, "Ajay");
		mp.put(11102, "Sam");
		mp.put(11103, "Jim");
		mp.put(11104, "Vinay");
		
		System.out.println(mp);
		System.out.println("Iterate method Using Keyset().. ");
		for(Integer i1:mp.keySet()) {
			System.out.println(i1);
		}
		
		System.out.println("Iterate method Using Valueset().. ");
		for(String s1:mp.values()) {
			System.out.println(s1);
		}
		

		System.out.println("Iterate method Using Entryset().. ");
		for(Entry<Integer, String> e1:mp.entrySet()) {
			System.out.println(e1);
		}
		
		Set<Entry<Integer, String>> set= mp.entrySet();
		Iterator<Entry<Integer, String>>  it=set.iterator();
		
		System.out.println("Using Iterator() method...");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		/*
		Iterator  it=mp.entrySet().iterator();
		System.out.println("Using Iterator method...");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
				
		}*/
	}

}
