package com.arraylist.cwassignment;

import java.util.ArrayList;
import java.util.Iterator;

/*4.WAP to print all elements of ArrayList using iterator*/
public class ArrayListWithoutGeneric3 {

	public static void main(String[] args) {

		ArrayList arrayList=new ArrayList();		
		arrayList.add(5);
		arrayList.add("Navin");
		arrayList.add(true);
		arrayList.add(12.2f);

		Iterator<Object> itr=arrayList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
