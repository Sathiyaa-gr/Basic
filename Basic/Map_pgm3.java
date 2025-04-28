package Collectionpkg;

import java.util.HashMap;
import java.util.Map;

public class Map_pgm3 {
public static void main(String[] args) {
	Map<Integer,String> m1=new HashMap<Integer,String>();
	//Adding element to map
	m1.put(1233444, "Sanjay");
	m1.put(7233544, "Naren");
	m1.put(4646765, "Diya");
	m1.put(3558748, "Akil");
	m1.put(3566445, "Kiru");
	m1.put(6654544, "Ajay");
	m1.put(3333444, "Ishu");
	System.out.println(m1);
	
	//key set
	System.out.println("Key set..");
	System.out.println(m1.keySet());

	//values
	System.out.println("Values set..");
	System.out.println(m1.values());
			
	//Isempty
	boolean b2=m1.isEmpty();
	System.out.println("IS Empty:"+b2);
	
	
	
}
}
