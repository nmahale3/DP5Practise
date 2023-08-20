package com.tq.day5.dowhileandnested;

import java.util.Scanner;

public class TableUptoGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number untill you want table....");
		int num=sc.nextInt();
		for(int i=01;i<=10;i++)
		{
			for (int j = 01; j <=num; j++)
			{
				System.out.print(j+" * "+i+" = "+(j*i)+"     ");
			}
			System.out.println();
		}
		sc.close();
	}
}


