package com.arraylist;

import java.util.ArrayList;

public class ArrayListStringDemo4 {

	public static void main(String[] args) {
		ArrayList<String> namelist1 = new ArrayList<String>();

		namelist1.add("Navin");
		namelist1.add("Suraj");
		namelist1.add("Sharda");
		namelist1.add("Saurabh");
		namelist1.add("Ganesh");
		System.out.println(namelist1);

		ArrayList<String> namelist2 = new ArrayList<String>();
		namelist2.add("Navin");
		namelist2.add("Sharda");
		namelist2.add("Rushikesh");
		namelist2.add("Prasad");
		namelist2.add("Abhishek");
		System.out.println(namelist2);

		namelist1.addAll(namelist2);
		System.out.println(namelist1);
		System.out.println(namelist2);
		
		boolean ans =namelist1.containsAll(namelist2);
		System.out.println("ans: "+ans);
	}
}


