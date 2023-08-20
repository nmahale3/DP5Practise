package com.arraylist;

import java.util.*;

public class ArrayListStringDemo6 {

	public static void main(String[] args) {
		ArrayList<String> namelist1 = new ArrayList<String>();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter how many string you want to enter");
		int num=s.nextInt();
		System.out.println("Enter the strings");
		for (int i = 1; i <=num; i++) {
			namelist1.add(s.next());			
		}
		
		for (String st : namelist1) {
			System.out.print(st.toUpperCase()+" ");
		}
		s.close();
	}
}


