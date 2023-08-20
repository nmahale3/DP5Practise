package com.tq.day6.number.patterns;

public class AAbAbcpattern {
	public static void main(String[] args) {
		System.out.println("A AB ABC pattern");
		for(char i='A';i<='D';i++)
		{
			for (char j = 'A'; j <=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("===========================================");

		System.out.println("A BB CCC pattern");
		for(char i='A';i<='D';i++)
		{
			for (char j = 'A'; j <=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println("===========================================");

		System.out.println("A AB ABC typecasting pattern");
		for(int i=0;i<=4;i++)
		{
			for (int j = 0; j <=i; j++) {
				System.out.print((char)(j+65));
			}
			System.out.println();
		}
		System.out.println("===========================================");

		System.out.println("A BB CCC typecasting pattern");
		for(int i=0;i<=4;i++)
		{
			for (int j = 0; j <=i; j++) {
				System.out.print((char)(i+65));
			}
			System.out.println();
		}
		System.out.println("===========================================");

		System.out.println("Box Pattern");
		for(int i=1;i<=5;i++)
		{
			for (int j = 1; j <=5; j++)
			{
				if(i==1||i==5||j==1||j==5)
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");	
				}
			}
			System.out.println();
		}
		System.out.println("===========================================");

		System.out.println("Multiplication Pattern");
		for(int i=1;i<=5;i++)
		{
			for (int j = 1; j <=5; j++)
			{
				if(i==j||j+i==6)
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");	
				}
			}
			System.out.println();
		}
		System.out.println("===========================================");

		System.out.println("Empty Triangle * Pattern");
		for(int i=1;i<=5;i++)
		{
			for (int j = 1; j <=5; j++)
			{
				if(i==1||j==5||i==j)
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");	
				}
			}
			System.out.println();
		}
		System.out.println("===========================================");

		System.out.println("Empty Triangle * Pattern");
		for(int i=1;i<=5;i++)
		{
			for (int j = 1; j <=5; j++)
			{
				if(i==5||j==1||i==j)
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");	
				}
			}
			System.out.println();
		}
		System.out.println("===========================================");

		System.out.println("Binary box 1 0 1 0 1 pattern");
		for (int i = 1; i <=5; i++)
		{
			for (int j = 0; j <=4; j++)
			{
				System.out.print(((i+j)%2)+" ");
			}	
			System.out.println();
		}
		System.out.println("===========================================");
		
		System.out.println(" Given Alphanumeric Triangle pattern\nA\n1 2\nA B C\n1 2 3 4\nA B C D E");
	
		System.out.println("XjActual output");
		for (int i = 1; i <=5; i++)
		{
		  for(int j=1;j<=i;j++)
		  {
			  if(i%2!=0)
			  {
				  System.out.print((char)(j+64)+" ");
			  }
			  else
			  {
				  System.out.print(j+" ");
			  }
		  }
		  System.out.println();
		}
		
	}
}

