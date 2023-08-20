package com.arraylist;

import java.util.*;

public class ArrayListDemo2_1 {
	public static void main(String[] args) {
		ArrayList<String> namelist = new ArrayList<String>();
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
	}
}
