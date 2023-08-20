package day22.array2d;

import java.util.Arrays;

/*
 * 48.	WAP to reverse the array itself,
 * don’t print array in reverse – I want current array reverse.
 * Means e.g. arr[] = [3, 90, 45, 29, 37, 78] 
 * so your same array must be [78, 37, 29, 45, 90, 3]
 * without using tempor------ary array.
 */
public class Program48 {
	
	 public static void reverseArray(int[] a) {
	        int initial = 0;
	        int last = a.length - 1;
	        
	        while (initial < last) {
	           
	            int t = a[initial];
	            a[initial] = a[last];
	            a[last] = t;	            
	            initial++;
	            last--;
	        }
	        for (int n : a) {
	           
	        } 
	        System.out.print(Arrays.toString(a));
	       
	 }

		    public static void main(String[] args) {
		        int[] arr = {3, 90, 45, 29, 37, 78};
		        System.out.println("-----Before Execution-----");
		        System.out.println(Arrays.toString(arr));
		        System.out.println("-----After Execution-----");
		        reverseArray(arr);
		       
		        // Output: 78 37 29 45 90 3
		    }
		}

	
