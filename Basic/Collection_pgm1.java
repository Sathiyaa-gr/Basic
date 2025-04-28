package Collectionpkg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collection_pgm1 {

	public static void main(String[] args) {
		
		Collection col= new ArrayList();
		
		col.add(12);
		col.add("Hello");
		col.add("john"); 
		col.add(55);
		col.add(null);
		col.add('d');
		System.out.println(col);
		
		//using Iterator 
		Iterator it=col.iterator();
		System.out.println("Using Iterator:");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
