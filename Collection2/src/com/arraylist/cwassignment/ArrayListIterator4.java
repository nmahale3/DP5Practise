package com.arraylist.cwassignment;

import java.util.ArrayList;

/*3.WAP to use add operation of ArrayList*/
public class ArrayListIterator4 {

	public static void main(String[] args) {
		
		ArrayList arrayList=new ArrayList();		
		arrayList.add(5);
		arrayList.add("Navin");
		arrayList.add(true);
		arrayList.add(12.2f);
		
		
		//if there is no generic used in array list so must use object
		for (Object i : arrayList) {
			System.out.println(i);
		}
		System.out.println(arrayList);
	}
}
