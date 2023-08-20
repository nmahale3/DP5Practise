package com.tq.day18.arraylogical;

public class EvenUsingArray {

	public static void evenNumbersFromAraay(int a[]) 
	{
		int len=a.length;
		for (int i = 0; i < len; i++)
		{
			if (a[i]%2==0)
			{
				System.out.print(a[i]+" ");
			}

		}
	}
	public static void main(String[] args) {
		int num[]= {93,87,47,05,23,8,04,29,24,30,32};
		System.out.println("Even Numbers are");
		evenNumbersFromAraay(num);

	}
}