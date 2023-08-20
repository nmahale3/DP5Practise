package com.arraylist.cwassignment;

import java.util.ArrayList;

/*17.	WAP to insert an element into the ArrayList at the first position*/
public class Program17 {

	public static void main(String[] args) {
		
		ArrayList<Integer> arraInt=new ArrayList<Integer>(); 
		arraInt.add(14);
		arraInt.add(15);
		arraInt.add(16);
		arraInt.add(17);
		arraInt.add(18);
		arraInt.add(19);
		
		System.out.println(arraInt);
		
		arraInt.add(0, 12);
		System.out.println("After insertion");
		System.out.println(arraInt);
		
	
	}
}
