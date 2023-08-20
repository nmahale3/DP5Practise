package com.arraylist;

import java.util.*;

public class ArrayListWithListIterator {

	public static void main(String[] args) {
		ArrayList<String> colorlist = new ArrayList<String>();
		colorlist.add("red");
		colorlist.add("blue");
		colorlist.add("yellow");
		colorlist.add(null);
		colorlist.add("white");
		
		//it is only applicable to list collection
		//bi-directional but first you hav to traverse forward so you can traverse backword
		
		System.out.println("---forward---");
		ListIterator<String> listItr=colorlist.listIterator();
		while (listItr.hasNext()) {
		System.out.println(listItr.next());
		}
		System.out.println("---backward---");
		while (listItr.hasPrevious()) {
			System.out.println(listItr.previous());
		}
	}
}


