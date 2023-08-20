package com.arraylist.cwassignment;

import java.util.ArrayList;

/*12.	WAP to test an ArrayList is empty or not*/
public class TestArrayListEmpty12 {
	public static void main(String[] args) {
	ArrayList<Object> list1=new ArrayList<Object>();	
	System.out.println("Before Adding check is Empty");
	System.out.println(list1.isEmpty());
	list1.add("Rushi");
	list1.add("Navin");
	list1.add("Shashikant");
	list1.add("Ganesh");
	System.out.println("After Adding check is Empty");
	System.out.println(list1.isEmpty());
	}
}
