package day18.array.assignment;

import java.util.*;
public class RotateByThree {
	public static void rotateBy3(int a[],int n)
	{
		int b[]=new int[a.length];
		int k=0;
		for(int i=n;i<a.length;i++)
		{
			b[k]=a[i];
			k++;
		}
		for(int i=0;i<n;i++)
		{
			b[k++]=a[i];
		}
		System.out.println(Arrays.toString(b));
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		System.out.println("Enter "+n+" elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		rotateBy3(arr, n);
		
	}
}
