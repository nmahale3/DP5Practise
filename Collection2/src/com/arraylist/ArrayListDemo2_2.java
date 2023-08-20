package com.arraylist;

import java.util.*;

public class ArrayListDemo2_2 {
	public static void main(String[] args) {
		ArrayList<Integer> ints = new ArrayList<Integer>();
		ints.add(12);
		ints.add(13);
		ints.add(14);
		ints.add(15);
		System.out.println(ints);
		
		
		//foreach loop
		for (Integer i: ints) {
		System.out.println(i);
		}
		
		//for loop
		for (int i = 0; i < ints.size(); i++) {
			System.out.println(ints.get(i));			
		}
	}
}
