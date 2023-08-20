package day5.whileloop;

import java.util.Scanner;

public class FrequencyofSingleDigit {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		System.out.println("Enter the number of occurance");
		int occurance = sc.nextInt();
		sc.close();
		int count=0;
		while(num>0)
		{
			int digit=num%10;
			if(digit==occurance)
			{
				count++;
			}
			num/=10;
		
		}
		System.out.println(occurance+" comes "+count+" times" );
	}

}
