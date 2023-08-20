package com.arraylist.cwassignment;

import java.util.ArrayList;

/*1.WAP to add elements to arraylist without using generics
 *  (no <>) and print content of it where Integer is used.
 *   In second arraylist String is used.*/
public class ArrayListWithoutGeneric1 {

	public static void main(String[] args) {
		
		ArrayList intArrayList=new ArrayList();		
		intArrayList.add(5);
		intArrayList.add(8);
		intArrayList.add(8);
		intArrayList.add(9);
		intArrayList.add(97);
		intArrayList.add(5);
		
		System.out.println("By using for each loop");
		//if there is no generic used in array list so must use object
		for (Object i : intArrayList) {
			System.out.println(i);
		}
		System.out.println(intArrayList);
		
		ArrayList stringArrayList=new ArrayList();		
		stringArrayList.add("Navin");
		stringArrayList.add("Rushi");
		stringArrayList.add("Dugge");
		stringArrayList.add("Navin");
		stringArrayList.add("Sharad");
		stringArrayList.add("Rahul");
		
		System.out.println(stringArrayList);	
		
		
	}
}
