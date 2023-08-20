package com.arraylist;

import java.util.*;

public class ArrayListStringDemo5 {

	public static void main(String[] args) {
		ArrayList<String> namelist1 = new ArrayList<String>();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter how many string you want to enter");
		int num=s.nextInt();
		System.out.println("Enter the strings");
		for (int i = 1; i <=num; i++) {
			namelist1.add(s.next());			
		}
		System.out.println(namelist1);
		s.close();
	}
}


