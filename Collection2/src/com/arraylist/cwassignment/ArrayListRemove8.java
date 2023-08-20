package com.arraylist.cwassignment;

/*8.WAP to remove element from ArrayList*/
import java.util.ArrayList;

public class ArrayListRemove8 {

	public static void main(String[] args) {
		ArrayList arrayList=new ArrayList();		
		arrayList.add(5);
		arrayList.add("Navin");
		arrayList.add(true);
		arrayList.add(12.2f);
		
		System.out.println(arrayList);
		
		System.out.println("After remove method");
		arrayList.remove(0);
		arrayList.remove(2);
		System.out.println(arrayList);
	}
}
