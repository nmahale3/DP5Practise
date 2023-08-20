package com.arraylist.cwassignment;

import java.util.ArrayList;

/* 7. WAP to create a new ArrayList, 
 * add some colors (string) and print the collection.
 */

public class ArrayListAddOperation7 {

public static void main(String[] args) {
	ArrayList<String> color=new ArrayList<>();
	
	System.out.println("Befor Adding");
	color.add("Red");
	color.add("Green");
	color.add("Blue");
	color.add("White");
	System.out.println(color);
	System.out.println("ArrayList Size : "+color.size());

	
	System.out.println("\nAfter Adding");
	color.add("Black");
	color.add("Maroon");
	color.add("Pitch");
	System.out.println(color);
	System.out.println("ArrayList Size : "+color.size());
}
}

