package com.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting {

	public static void main(String[] args) {
		
		ArrayList<String> namelist = new ArrayList<String>();
		namelist.add("Navin");
		namelist.add("Suraj");
		namelist.add("Aman");
		namelist.add("Dipak");
		System.out.println("---------Added---------");
		System.out.println(namelist);
		
		
//		System.out.println("---------After sorting---------");
//		Collections.sort(namelist);
//		System.out.println(namelist);
		
//		System.out.println("---------After reverse---------");
//		Collections.reverse(namelist);
//		System.out.println(namelist);
		
		System.out.println("---------After Descending order---------");
		Collections.sort(namelist);
		Collections.reverse(namelist);
		System.out.println(namelist);
		
		
		
	}
}
