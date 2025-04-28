package Collectionpkg;

import java.util.HashMap;
import java.util.Map;

public class Map4 {

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

		
		
	System.out.println("Map1 Keys & values..");
	System.out.println(m1.entrySet());
	
		

	}

}
