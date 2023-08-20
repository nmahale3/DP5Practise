package day18.array.assignment;

import java.util.Arrays;

public class Profram22 {
private static void reverseNumber(int arr[]) {
	int j=0, k[]=new int[arr.length];
	System.out.println(arr.length);
	for(int i=arr.length-1;i>=0;i--)
	{
		k[j]=arr[i];
		j++;
	}
	System.out.println(Arrays.toString(k));
}
	public static void main(String[] args) {
		int arr[]= {3, 90, 45, 29, 37, 78};
		reverseNumber(arr);

	}

}
