package com.arraylist.cwassignment;
import java.util.*;
/*16.	WAP to retrieve an element (at a specified index) from a given ArrayList*/
public class RetrieveElement16 {

	    public static void main(String[] args) {
	        // Create an ArrayList of integers
	        ArrayList<Integer> integerList = new ArrayList<>();
	        integerList.add(10);
	        integerList.add(20);
	        integerList.add(30);
	        integerList.add(40);
	        integerList.add(50);
	       
	        int retrievingIndex = 2;

	        
	        if (retrievingIndex >= 0 && retrievingIndex < integerList.size())
	        {
	            Integer retrivedElement = integerList.get(retrievingIndex);
	            System.out.println("Element at index " + retrievingIndex + ": " + retrivedElement);
	        }
	        else
	        {
	            System.out.println("Index out of bounds.");
	        }
	    }
}
