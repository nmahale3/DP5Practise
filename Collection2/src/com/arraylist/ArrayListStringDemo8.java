package com.arraylist;

import java.util.*;

public class ArrayListStringDemo8 {

	public static void main(String[] args) {
		ArrayList<String> schoolbag = new ArrayList<String>();
	schoolbag.add("pen");
	schoolbag.add("books");
	schoolbag.add("pencils");
	schoolbag.add("tiffin");
	schoolbag.add("raincoat");
	schoolbag.add("waterbottle");
	
	ArrayList<String> tutionbag = new ArrayList<String>();
	tutionbag.add("pen");
	tutionbag.add("umbrella");
	tutionbag.add("pencils");
	tutionbag.add("books");
	
	System.out.println("school bad List: "+schoolbag);;
	System.out.println("tution bad List: "+tutionbag);;
	
	schoolbag.retainAll(tutionbag);
	
	System.out.println("-----retain-----");
	System.out.println("school bad List: "+schoolbag);;
	System.out.println("tution bad List: "+tutionbag);;
	
	}
}


