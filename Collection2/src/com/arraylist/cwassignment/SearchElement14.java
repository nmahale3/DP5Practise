package com.arraylist.cwassignment;

import java.util.*;

/*14.WAP to search an element from ArrayList*/
public class SearchElement14 {

	public static void main(String[] args) {
		ArrayList list= new ArrayList();
		list.add("Navin");
		list.add("ram");
		list.add("sham");
		list.add("mohan");
		list.add("rohan");
		System.out.println(list.contains("Navin"));
		System.out.println(list.indexOf("rohan"));
	}
}
