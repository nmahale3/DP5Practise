package com.tq.day5.dowhileandnested;

public class Pattern5 {
	public static void main(String[] args) {
		for (int i = 1; i < 6; i++)
		{
			for (int j = 1; j <=i; j++) 
			{
			if(j==1||j==3||j==5)
//		if(j%2!=0)
				
				{
					System.out.print("1");
				}
				else
				{
					System.out.print("0");
				}
				
			}
			System.out.println();
		}
		
	}

}
