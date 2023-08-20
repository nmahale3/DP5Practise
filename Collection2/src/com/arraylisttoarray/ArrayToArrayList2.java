package com.arraylisttoarray;

import java.util.*;

public class ArrayToArrayList2 {

	public static void main(String[] args) {
//		array to arraylist
		String s1[]= {"Navin","Rushikesh","Saurabh"};
		
//		case1
		List<String> arlisst= Arrays.asList(s1);
		System.out.println("-----List-----");
		System.out.println(arlisst);

//		case2
		List<String> nlist= new ArrayList<String>();
		Collections.addAll(nlist, s1);
		System.out.println(nlist);
		
//		case-3 manually homework
	}
	

}
