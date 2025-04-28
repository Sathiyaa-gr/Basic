package Collectionpkg;

import java.util.HashMap;
import java.util.Map;

public class Map_pgm2 {
public static void main(String[] args) {
	//	methods like get(), containsKey(), containsValue(), putIfAbsent(), equals()
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
	
	Map<Integer,String> m2=new HashMap<Integer,String>();
	//Adding element to map
	m2.put(6556444, "ABC");
	m2.put(8988944, "xzxz");
	System.out.println(m2);
	
	//remove
	System.out.println("Remove...");
	m1.remove(3566445);
	System.out.println(m1);
	m1.remove(3558748, "Akil");
	System.out.println(m1);
	//Map contains
	System.out.println("Contains ..");
			m1.containsKey(3333444);
	System.out.println(m1);
	boolean b1=m1.containsValue("Kiru");
	System.out.println("containsValue: "+b1);
	//Get value from map
	String s1=m1.get(6654544);
	System.out.println(s1);
	Object s2= m1.getOrDefault(7233544, "Naren");
	System.out.println(s2);
	
	//PutIFAbsent
	m1.putIfAbsent(3558748, "Akil");
	System.out.println(m1);
	
}
}
