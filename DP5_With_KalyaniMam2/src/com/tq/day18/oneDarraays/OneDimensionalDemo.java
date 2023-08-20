package com.tq.day18.oneDarraays;

public class OneDimensionalDemo {

	public static void main(String[] args) {
		//array Declaration
		int num[];
		
		num=new int[5];// Array initialization
		
		// or we can declare it with same i.e. int num[] = new int[size of an array]
		System.out.println("----------------Before assigning the values---------------------");
		System.out.println("Element at index 0 :\t"+num[0]);
		System.out.println("Element at index 1 :\t"+num[1]);
		System.out.println("Element at index 2 :\t"+num[2]);
		System.out.println("Element at index 3 :\t"+num[3]);
		System.out.println("Element at index 4 :\t"+num[4]);




//		num[0]=10;
//		num[1]=20;
//		num[2]=30;
//		num[3]=40;
//		num[4]=50;
		//num[]= {10,20,30,40,50};
		System.out.println("----------------After assigning the values---------------------");
		System.out.println("Element at index 0 :\t"+num[0]);
		System.out.println("Element at index 1 :\t"+num[1]);
		System.out.println("Element at index 2 :\t"+num[2]);
		System.out.println("Element at index 3 :\t"+num[3]);
		System.out.println("Element at index 4 :\t"+num[4]);
	}
}
