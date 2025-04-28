package Collectionpkg;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<Object> alist=new ArrayList();
		
		// add data 
		alist.add("Java");
		alist.add('H');
		alist.add(100);
		alist.add("Java");
		alist.add(120.3);
		alist.add(100);
		alist.add(true);
		System.out.println("After adding "+alist);
		
		//remove an element
		alist.remove(3);
		System.out.println("After remove: "+alist);
		
		//insert element 
		alist.add(3, "API");
		System.out.println("Inserting : "+alist);
		
		//modify/ replace array element
		alist.set(2, 45);
		System.out.println("Mdifying : "+alist);
		
		//size of array
		System.out.println("Size of array: "+alist.size());
		
		//Access specific element from array
		System.out.println(alist.get(5));
		
		//read element using for loop
		for(int i=0; i<alist.size();i++)
		{
			System.out.println(alist.get(i));
			
		}
		
		// for .. enchan
		for(Object x:alist)
		{
			System.out.println("elemant: "+x);
		}
		//using Iterator
		 Iterator it= alist.iterator();
		 
		 while(it.hasNext())
		 {
			 System.out.println(it.next());
		 }
		
		// clear / remove all elements
		 alist.clear();
		 System.out.println(alist);
		 
	}

}
