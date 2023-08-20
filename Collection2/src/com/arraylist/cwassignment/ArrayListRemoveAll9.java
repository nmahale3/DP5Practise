package com.arraylist.cwassignment;
/*9.WAP to remove all elements from ArrayList*/
import java.util.ArrayList;
public class ArrayListRemoveAll9 {
	
	public static void main(String[] args) {
		ArrayList arrayList=new ArrayList();		
		arrayList.add(5);
		arrayList.add("Navin");
		arrayList.add(true);
		arrayList.add(12.2f);
		
		System.out.println(arrayList);
		
		System.out.println("After removing all elements from List");
		arrayList.clear();
		System.out.println(arrayList);
		
	}
}
