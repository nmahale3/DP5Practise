package com.arraylist.cwassignment;

import java.util.ArrayList;

/*15.	WAP to search the specified collection in this collection*/
public class SearchSpecifiedCollection15 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Ram");
		list.add("Om");
		list.add("Krish");

		ArrayList<String> list2 = new ArrayList<String>();

		list2.add("Ram");
		list2.add("Sham");
		list2.add("hari");
		list2.add("Om");
		
		
		list.addAll(list2);
		System.out.println(list);
		boolean b=list.containsAll(list2);
		if (b) 
		{
			System.out.println("List 1 Contains List2");
		}
		else
		{
			System.out.println("List 1 not Contains List2");
		}
		

	}
}
