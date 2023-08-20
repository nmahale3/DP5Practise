package com.arraylist.cwassignment;

import java.util.*;

public class MatchTwoCollections19 {

	public static void main(String[] args) {

		ArrayList<Integer> listA = new ArrayList<>();
		listA.add(1);
		listA.add(2);
		listA.add(3);
		listA.add(4);
		listA.add(5);
		listA.add(5);
		listA.add(3);

		
		ArrayList<Integer> listB = new ArrayList<>();
		listB.add(3);
		listB.add(4);
		listB.add(5);
		listB.add(6);
		listB.add(7);
		
		listA.retainAll(listB);
		System.out.println(listA);
	}

}
