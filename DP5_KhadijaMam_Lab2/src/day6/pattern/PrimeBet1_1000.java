package day6.pattern;

import java.util.Scanner;

public class PrimeBet1_1000 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Start Range of prime number");
		int startRange=sc.nextInt();
		System.out.println("Enter End Range of prime number");
		int endRange=sc.nextInt();
		//		int sum=0;
		for(int i=startRange;i<=endRange;i++)
		{
			if(i>1)

			{		

				boolean isPrime=true;
				for (int j = 2; j <=i-1; j++)
				{

					if(i%j==0)
					{

						isPrime = false;

						break;
					}

				}
				if(isPrime==true)
					System.out.print(i+" ");

			}

		}
		sc.close();
	}
}
