package Collectionpkg;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Map_Account {

	public static void main(String[] args) {

		Map<Integer,String> map_acc=new HashMap<Integer,String>();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of account to add:");
		int num=sc.nextInt();
		
		for(int i=0;i<num;i++)
		{
			System.out.println("Enter Account no:");
			int acc=sc.nextInt();
			System.out.println("Enter Account holder Name:");
			String name=sc.next();
			map_acc.put(acc, name);
			
		}
		
		
		System.out.println(map_acc);
		
		
		
		

	}


}
