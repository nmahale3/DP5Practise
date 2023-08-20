package com.arraylist.cwassignment;

import java.util.ArrayList;

/*6.	WAP to iterate through all elements in an ArrayList using for each*/
public class ArrayListWithForEachLoop6 {

	public static void main(String[] args) {
		
		ArrayList arrayList=new ArrayList();		
		arrayList.add(5);
		arrayList.add("Navin");
		arrayList.add(true);
		arrayList.add(12.2f);
	
		for (Object object : arrayList) {
			System.out.println(object);
		}
	}
}
