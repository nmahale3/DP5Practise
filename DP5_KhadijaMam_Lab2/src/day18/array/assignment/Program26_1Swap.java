package day18.array.assignment;

import java.util.Arrays;

public class Program26_1Swap {

	public static void swappingOfArray(int arr[])
	{
		int temp;
		for (int i = 0; i < arr.length/2; i++) 
		{
			temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;			
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		int arr[]= {2, 4, 9, 0,5};
		int arr2[]= {4,6,12,8,3};
		swappingOfArray(arr2);
	}
}
