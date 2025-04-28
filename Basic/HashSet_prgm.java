package Collectionpkg;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_prgm {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		//Add new element
		hs.add("live");
		hs.add(45);
		hs.add('d');
		hs.add(45);
		hs.add("test");
		hs.add(10.2);
		System.out.println(hs);
		
		//remove element 
		hs.remove("test");
		System.out.println("After remove: "+hs);

		//size
		hs.size();
		System.out.println("Size : "+hs);
		
		//for enhanced
		System.out.println("for ....");
		for(Object x:hs)
		{
			System.out.println(x);
		}
		//Iterator
		Iterator it=hs.iterator();
		System.out.println("Iterator ...");
		 while(it.hasNext())
		 {
			 System.out.println(it.next());
		 }
		
		//remove all 
		 hs.clear();
		 System.out.println(hs);
	}

}
