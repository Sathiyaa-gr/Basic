package Collectionpkg;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;

public class List_pgm {

	public static void main(String[] args) {
	
		List <Object>list=new ArrayList();
		list.add(45);// adding element to list
		list.add('g');
		list.add(86);
		list.add(null);
		list.add("john");
		list.add("mary");
		System.out.println("After adding:"+list);
		
		//remove element
		list.remove(3);
		System.out.println("After remove:"+list);
		
		//Modify element
		list.set(3, "Java");
		System.out.println("Modify :"+list);
		
		//insert
		list.add(2,"Lal");
		System.out.println("After insert:"+list);
		
		//size
		System.out.println(list.size());
		
		//iterator 
		Iterator it=list.iterator();
		System.out.println("Iterator --");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		//reversed
	Object obj=	list.reversed();
		System.out.println(obj);
		list.removeAll(list);
		System.out.println(list);
		//clear/ delete element
		list.clear();
		System.out.println(list);
		//list.l

	}

}
