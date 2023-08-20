package com.arraylisttoarray;

import java.util.ArrayList;

public class ArrayListToArray1 {

	public static void main(String[] args) {
		ArrayList<String> namelist = new ArrayList<String>();
		namelist.add("Navin");
		namelist.add("Suraj");
		namelist.add("Sharda");
		namelist.add("Saurabh");
		int size=namelist.size();
		
//		case-1 = object to array
		Object starrr[]=namelist.toArray();
		System.out.println("------Array------");
		for (Object obj : starrr) {
			System.out.println(obj);
		}
		
//		case-2 arraylist to array by using perticular datatype only
		String arr1[]=new String[size];
		arr1=namelist.toArray(arr1);
		System.out.println("arraylist to array by using perticular datatype only");
		for (String string : arr1) {
			System.out.println(string);
		}
		
//		case-3 array to array list
		System.out.println("Arraylist to array manually ");
		String newarr[]=new String[size];
		for (int i = 0; i < size; i++) {
			newarr[i]=namelist.get(i);
		}
		for (String s : newarr) {
			System.out.println(s);
		}
	}
	

}
