package Collectionpkg;


import java.util.Enumeration;
import java.util.Vector;

public class Vector_class {

	public static void main(String[] args) {
		
		Vector<String> v=new Vector();
		v.addElement("Jim");
		v.addElement("Mary");
		v.addElement("Tom");
		v.addElement("Lily");
		
		
		Enumeration <String> num=v.elements();
		
		System.out.println("Using Enumeration-- ");
		while(num.hasMoreElements())
		{
			System.out.println(num.nextElement());
		}
		

		v.set(2, "Arun");
		
		v.setElementAt(null, 3);
		System.out.println(v);
	}

}
