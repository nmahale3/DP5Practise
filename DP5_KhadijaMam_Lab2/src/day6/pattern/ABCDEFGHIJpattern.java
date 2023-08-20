package day6.pattern;

import java.util.Scanner;

//import java.util.Scanner;

public class ABCDEFGHIJpattern
{

	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the Size");
		int size=s.nextInt();	
		char ch ='A';
		for (int i=1;i<=size;i++)
		{
			for(char j =1;j<=i;j++)
			{
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
		s.close();
	}

}
