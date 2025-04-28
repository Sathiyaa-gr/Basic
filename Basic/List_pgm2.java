package Collectionpkg;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class List_pgm2 {

	public static void main(String[] args) {
		List <Object>list=new ArrayList();
		list.add(45);// adding element to list
		list.add('g');
		list.add(86);
		list.add(null);
		list.add("K");
		list.add("Jim");
		
		System.out.println("After adding:"+list);
		
		ListIterator<Object> lit=list.listIterator();
		
		System.out.println("Forward direction...");
		while(lit.hasNext())
		{
			System.out.println(lit.next());
			
		}
		
		System.out.println("...Backward direction");
		while(lit.hasPrevious())
		{
			System.out.println(lit.previous());
		}
		
		//list.reversed();
		//System.out.println("After reverse:"+list);
		//list.sort(null);
		//System.out.println("After Sort:"+list);
		//list.
		
	}

}
