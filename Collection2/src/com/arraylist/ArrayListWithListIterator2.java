package com.arraylist;

import java.util.*;

public class ArrayListWithListIterator2 {

	public static void main(String[] args) {
		ArrayList<Integer> numlist = new ArrayList<Integer>();
		numlist.add(12);
		numlist.add(90);
		numlist.add(25);
		numlist.add(5);
		numlist.add(36);
		
		
		ListIterator<Integer> numItr=numlist.listIterator();
		while (numItr.hasNext()) {
			if(numItr.next()%2!=0)
			{
//	numlist.remove(itr.next());
//	throws ConcurrentModificationException
			numItr.remove();
			}
		}
		System.out.println("---after removing odd numbers---");
		for (Integer i : numlist) {
			System.out.println(i);
		}
	}
}


