package com.tq.day18.oneDarraays;

public class OneDimensionalDemo2 {
	public static void main(String[] args) {
		
		//array literal
		char ch[]= {'a','b','c','d','e','f'};
		//char ch1[]= new char[]{};
		
		int len= ch.length,i;
		System.out.println("Length of ch 	\t:"+len);
		System.out.println("First ele of ch \t:"+ch[0]);
		System.out.println("Last ele of ch	\t:"+ch[len-1]);
		System.out.println("Length ele of ch\t:"+(len-1));
	
		//Accessing array element using for loop
		//i=0;
		//i<len
		for (i= 0; i <len; i++) {
			System.out.println("Element of ch at "+i+" \t:"+ch[i]);
		}
	}

}
