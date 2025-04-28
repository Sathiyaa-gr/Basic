package Collectionpkg;

import java.util.HashMap;
import java.util.Map;

public class Map_pgm 
{

	public static void main(String[] args) 
	{
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
		
				//remove
		System.out.println("Remove...");
		m1.remove(3566445);
		System.out.println(m1);
		m1.remove(3558748, "Akil");
		System.out.println(m1);
		//Map contains
		System.out.println("Contains methos..");
				m1.containsKey(3333444);
		System.out.println(m1);
		boolean b1=m1.containsValue("Kiru");
		System.out.println(b1);
		//Get value from map
		String s1=m1.get(6654544);
		System.out.println(s1);
		Object s2= m1.getOrDefault(7233544, "Naren");
		System.out.println(s2);
		//key set
		System.out.println("Key set:"+m1.keySet());
		//values
		System.out.println("values set:"+m1.values());
		//Isempty
		boolean b2=m1.isEmpty();
		System.out.println("IS Empty:"+b2);
		//PutIFAbsent
		m1.putIfAbsent(3558748, "Akil");
		System.out.println(m1);
		// replace
		m1.replace(3558748, "sonali");
		System.out.println(m1);
		//Size
		System.out.println("Size:"+m1.size());
		
		Map<Integer,String> m2=new HashMap<Integer,String>();
		//Adding element to map
		m2.put(6556444, "ABC");
		m2.put(8988944, "xzxz");
		System.out.println(m2);
		//Entry Set
		System.out.println(m2.entrySet());
		m2.clear();
		System.out.println("After clear:"+m2);
		//equals
		boolean b3=m1.equals(m2);
		System.out.println("M1 equal to m2:"+b3);
		
		
		
		
	}

}
