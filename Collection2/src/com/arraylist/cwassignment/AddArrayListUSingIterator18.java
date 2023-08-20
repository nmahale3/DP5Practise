package com.arraylist.cwassignment;
import java.util.*;

/*18.	WAP to add 1 to 50 numbers in ArrayList and print only even numbers (using iterator)*/
public class AddArrayListUSingIterator18 {

	public static void main(String[] args) {

		ArrayList<Integer> numList = new ArrayList<Integer>();

		for (int i = 1; i <= 50; i++) {
			numList.add(i);
		}
		Iterator<Integer> itr = numList.iterator();
		/*
		 * while (itr.hasNext()) { if (itr.next() % 2 != 0) { itr.remove(); }
		 * 
		 * } for (Integer integer : numList) { System.out.println(integer); }
		 */
		/*
		 * while (itr.hasNext()) { int even=itr.next(); if (even%2 == 0) {
		 * System.out.println(even); } }
		 */

		/*
		 * while (itr.hasNext()) {
		 * 
		 * if (itr.next()%2!= 0) { System.out.println(itr.next()); } }
		 */
		while (itr.hasNext())
		{

			if (itr.next()%2== 0) 
			{ 
				continue;
			}
			else
			{
				System.out.println(itr.next());
			}
		}
	}

}
