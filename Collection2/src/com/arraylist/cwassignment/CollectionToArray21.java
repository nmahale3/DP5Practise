package com.arraylist.cwassignment;

/*21.	WAP to convert collection into array*/
import java.util.ArrayList;

public class CollectionToArray21 {

	public static void main(String[] args) {
		ArrayList<String> namelist = new ArrayList<String>();
		namelist.add("Navin");
		namelist.add("Suraj");
		namelist.add("Sharda");
		namelist.add("Saurabh");
		int size = namelist.size();
		Object starrr[]=namelist.toArray();
		System.out.println("------Array------");
		for (Object obj : starrr) {
			System.out.println(obj);
		}
	}
}
