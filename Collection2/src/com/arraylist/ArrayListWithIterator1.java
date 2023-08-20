package com.arraylist;

import java.util.*;

public class ArrayListWithIterator1 {

	public static void main(String[] args) {
		ArrayList<String> colorlist = new ArrayList<String>();
		colorlist.add("red");
		colorlist.add("blue");
		colorlist.add("yellow");
		colorlist.add(null);
		colorlist.add("white");
		
		
		//to retrieve element one by one
		//read and remove element
		//Universal iterator
		
		Iterator<String> itr=colorlist.iterator();
		
		/*
		 * System.out.println(itr.hasNext()); System.out.println(itr.next());
		 * 
		 * System.out.println(itr.hasNext()); System.out.println(itr.next());
		 * 
		 * System.out.println(itr.hasNext()); System.out.println(itr.next());
		 * 
		 * System.out.println(itr.hasNext()); System.out.println(itr.next());
		 * 
		 * System.out.println(itr.hasNext()); System.out.println(itr.next());
		 * 
		 * System.out.println("----after elents position completed error throws");
		 * 
		 * System.out.println(itr.hasNext()); System.out.println(itr.next());
		 */
	//or we can use while loop
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}


