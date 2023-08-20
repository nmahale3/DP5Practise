package com.arraylist;

import java.util.ArrayList;

public class ArrayListStringDemo2 {

	public static void main(String[] args) {
		ArrayList<String> namelist = new ArrayList<String>();
		
		System.out.println("isEmpty : "+namelist.isEmpty());//at first line without adding it shows true in isempty()
		namelist.add("Navin");
		namelist.add("Suraj");
		namelist.add("Sharda");
		namelist.add("Saurabh");
		System.out.println(namelist);


		//foreach loop
		for (String string : namelist) {
			System.out.println(string);
		}

		//for loop
		for (int i = 0; i < namelist.size(); i++) {
			System.out.println(namelist.get(i));			
		}
		System.out.println("\n-----After adding Growable in nature--------");
		namelist.add("Rushikesh");
		namelist.add("Subodh");
		namelist.add("Prasad");
		namelist.add("Rakeshh");
		namelist.add("Navin");
		namelist.add("Suraj");
		namelist.add("Mohan");
		namelist.add("Chaitanya");
		System.out.println("isEmpty : "+namelist.isEmpty());
		System.out.println(namelist);
		
		System.out.println(namelist.size());
		namelist.add(3, "Ramesh");
		
		System.out.println("After adding the name");
		System.out.println(namelist);
		System.out.println(namelist.size());
		
		System.out.println("After setting an elements it removes element and replace it");
		namelist.add(3,"Neeta");
		System.out.println(namelist);
		System.out.println(namelist.size());
		
	
	}
}


