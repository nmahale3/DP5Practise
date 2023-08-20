package com.arraylist.cwassignment;

import java.util.ArrayList;

/*10.	WAP to retain all elements from ArrayList*/
public class RetainAll10 {

	public static void main(String[] args) {
		
		ArrayList list1=new ArrayList();		
		list1.add("Rushi");
		list1.add("Navin");
		list1.add("Shashikant");
		list1.add("Ganesh");
		System.out.println("List1");
		System.out.println(list1);
		
		
		ArrayList list2=new ArrayList();		
		list2.add("Subodh");
		list2.add("Navin");
		list2.add("Suraj");
		list2.add("Ganesh");
		System.out.println("List2");
		System.out.println(list2);
		
		System.out.println("After Retaining all");
		list1.retainAll(list2);
		System.out.println(list1);
		
	}
}
