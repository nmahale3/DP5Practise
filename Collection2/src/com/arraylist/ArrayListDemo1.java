
package com.arraylist;
import java.util.*;
public class ArrayListDemo1 {

	public static void main(String[] args) {
	
		//non-Generic collection 
		ArrayList list = new ArrayList();
		//constructs empty list with an initial capacity
		System.out.println(list);//o/p : []
		
		//Add data in list
		//all primitive data types is converted in wrapper class 
		
		list.add("Navin");
		list.add(27);
		list.add(21.5);
		list.add(true);
		list.add('p');
		System.out.println(list);
		
		System.out.println("\n-----USing for loop------");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
		String s=(String)list.get(0);
		System.out.println(s);
	}
	
}
