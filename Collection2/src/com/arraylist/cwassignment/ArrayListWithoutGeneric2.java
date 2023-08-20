package com.arraylist.cwassignment;

import java.util.ArrayList;

/*2.WAP add elements to arraylist without using generics,
 *0th location keep Integer,1st location String 
 *now print each element and display contents*/
public class ArrayListWithoutGeneric2 {

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
