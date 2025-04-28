package Collectionpkg;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Vector;

public class Collection_casting {

	public static void main(String[] args) {
	// Upcasting on Different Data types (Int, Char, Double, string etc.) with different methods like Add, Remove, Contains.
		
		Collection<Object> col = new LinkedList<Object>();// upcasting
		 
		//add
		col.add(45);
		col.add(88);
		col.add('s');
		col.add('m');
		col.add(45.044);
		col.add("Ram");
		System.out.println("After add -"+col);
		
		//remove
		
		col.remove(45);
		col.remove(45.044);
		System.out.println("After Remove  -"+col);
		//contains
		
		System.out.println(col.contains("Ram"));
		System.out.println(col.contains(88));
		System.out.println(col.contains("Sita"));
	}

}
