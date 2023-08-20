package com.arraylist;

import java.util.*;

public class ArrayListDemo2_3 {
	public static void main(String[] args) {
		ArrayList<Float> ft = new ArrayList<Float>();
		ft.add(12f);
		ft.add(13f);
		ft.add(14f);
		ft.add(15f);
		System.out.println(ft);
		
		
		//foreach loop
		System.out.println("\nfor each loop");
		for (Float f: ft) {
		System.out.println(f);
		}
		
		//for loop
		System.out.println("\nfor loop");
		for (int i = 0; i < ft.size(); i++) {
			System.out.println(ft.get(i));			
		}
		//growable in nature
		System.out.println("\n-----After adding------");
		ft.add(16f);
		ft.add(11f);
		ft.add(12f);
		ft.add(19f);
		System.out.println(ft);
		
	}
}
