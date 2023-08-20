package com.arraylist;

import java.util.*;

public class ArrayListStringDemo7 {

	public static void main(String[] args) {
		ArrayList<String> colorlist = new ArrayList<String>();
	
		colorlist.add("red");
		colorlist.add("blue");
		colorlist.add("yellow");
		colorlist.add(null);
		colorlist.add("white");
		
		System.out.println(colorlist);
		String s = colorlist.remove(0);
		//throw IndexOutOfBoudException if index is not present in array 
		System.out.println("s="+s);
		System.out.println(colorlist);
	}
}


