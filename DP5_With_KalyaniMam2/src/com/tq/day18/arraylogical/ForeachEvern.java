package com.tq.day18.arraylogical;

public class ForeachEvern 
{
	
	public static void evenForeach(int num[])
	{
		
		for(int n:num)
		{
			if(n%2==0)
			{
				System.out.print(n+" ");
			}
		}
	}

	public static void main(String[] args) {

		int num[] = {21,34,67,87,43,32,66,86,8};
		evenForeach(num);
		
		
	}
}
