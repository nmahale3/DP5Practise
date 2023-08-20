package day18.array.mypractice;

import java.util.Arrays;

public class SwappingForLoop {
	
	public static void main(String[] args) {
		
		int a[]= {12,35,3,2,433,5,6}
		;
		int size=a.length;
		System.out.println("\tBefore Swapping\n"+Arrays.toString(a));
		for (int index = 0; index < size; index++) {
			if (index==3) {
				int temp=a[index-1];
				a[index-1]=a[index];
				a[index]=temp;
			}
		}
		System.out.println("\tAfter Swapping\n"+Arrays.toString(a));
		
	}

}
