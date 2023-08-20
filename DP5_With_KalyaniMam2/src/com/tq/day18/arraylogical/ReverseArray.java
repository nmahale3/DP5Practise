package com.tq.day18.arraylogical;

public class ReverseArray {
	
	public static void main(String[] args) {
		 
		int a[]= {12,34,56,78,97,65};
		int len=a.length;
		
		for(int i=len-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
	}

}
