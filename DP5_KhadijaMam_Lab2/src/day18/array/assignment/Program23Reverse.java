package day18.array.assignment;

import java.util.Arrays;

/*23.WAP to reverse the array itself,
 *  don’t print array in reverse –
 *  I want current array reverse. 
 * Means e.g. arr[] = [3, 90, 45, 29, 37, 78] 
 * so your same array must be [78, 37, 29, 45, 90, 3] 
 * without using temporary array. 
*/public class Program23Reverse {

	public static void reverseArray(int arr[]) {
//		int arr1[]=new int[arr.length];
//		System.out.println(Arrays.toString(arr));
//		int j=0;
//		for (int i = arr.length-1; i >=0; i--) {// only reverse
//			//System.out.println(arr[i]);
//			arr1[j]=arr[i];
//			j++;
//		}System.out.println(Arrays.toString(arr1));// by using temporary array

		for (int i = 0; i < arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
	}

	public static void main(String[] args) {
//		int arr[] = { 3, 90, 45, 29, 37, 78 };
		int arr[] = { 4,6,12,8,3};
		System.out.println(Arrays.toString(arr));
		reverseArray(arr);
		System.out.println(Arrays.toString(arr));
	}
}
