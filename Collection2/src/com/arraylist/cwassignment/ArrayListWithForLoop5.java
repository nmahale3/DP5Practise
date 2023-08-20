package com.arraylist.cwassignment;

import java.util.ArrayList;

/*5.WAP to iterate through all elements
 *  in an ArrayList using for loop*/
public class ArrayListWithForLoop5 {

	public static void main(String[] args) {
		
		ArrayList arrayList=new ArrayList();		
		arrayList.add(5);
		arrayList.add("Navin");
		arrayList.add(true);
		arrayList.add(12.2f);
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
	}
}
