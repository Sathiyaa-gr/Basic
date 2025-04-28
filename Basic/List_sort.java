package Collectionpkg;

import java.util.ArrayList;
import java.util.List;

public class List_sort {

	public static void main(String[] args) {
		
		List l1=new ArrayList<Integer>();
		l1.add(45);
		l1.add(34);
		l1.add(70);
		l1.add(12);
		l1.add(59);
		l1.add(98);
		l1.add(56);
		l1.add(86);
		System.out.println("After adding:"+l1);
		
		//sort
		l1.sort(null);
		System.out.println("Sort:"+l1);
		
		//reverse
		List rev=l1.reversed();
		System.out.println("Reverse :"+rev);
		
	}

}
