package com.arraylist.cwassignment;
//23.WAP to swapp two elements in arraylist 
import java.util.*;


public class SwappingElementsInList22 {

	public static void main(String[] args) {


		ArrayList<Integer> numlist1 = new ArrayList<Integer>();
		numlist1.add(12);
		numlist1.add(13);
		numlist1.add(14);
		numlist1.add(15);
		numlist1.add(16);

		System.out.println("Befor Swapping");
		System.out.println(numlist1);

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first Position of element which element you want to change:");
		int firstPos=sc.nextInt();
		System.out.println("Enter Second Position of element which element you want to Swapp:");
		int SecondPos=sc.nextInt();

		System.out.println("After Swapping");
		int temp=numlist1.get(firstPos);
		numlist1.set(2,numlist1.get(SecondPos));
		numlist1.set(SecondPos,temp);

		System.out.println(numlist1);


	}
}
