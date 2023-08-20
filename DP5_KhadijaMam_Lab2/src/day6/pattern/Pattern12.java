package day6.pattern;

import java.util.Scanner;

public class Pattern12 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter you choice");
		int choice=s.nextInt();
		
		for(int i=1;i<=choice;i++)
		{
			for (int j =(choice-1); j >=i; j--)
			{
				System.out.print(" ");				
			}
			for (int k =1; k<=i; k++) {
				System.out.print(k);
			}
			for(int l=i;l>=1;l--)
			{
				System.out.print(l);
			}

			System.out.println();
		}
		s.close();
	}

}
