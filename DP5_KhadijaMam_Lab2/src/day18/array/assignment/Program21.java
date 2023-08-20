package day18.array.assignment;

import java.util.Arrays;

public class Program21 {

	public static void reverseNumberSingleArray() {
int i;
		int arr[]= {3, 90, 45, 29, 37, 78};	
		System.out.print("["+" ");
		for (i = arr.length-1; i >=0; i--) {
			System.out.print(arr[i]+" ");
//			System.out.println(Arrays.toString(arr));  ---- not possible
		}
		System.out.print(" "+"]");
		
	}
	
	public static void main(String[] args) {
		reverseNumberSingleArray();
	}
}
