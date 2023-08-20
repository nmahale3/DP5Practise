package day5.hw.looping.assignment;

import java.util.Scanner;

public class EvenNumberSumFromNumber {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int num =s.nextInt();
		double digit,sum=0,count=0,temp=num;
		s.close();
		while(num>0)
		{
			num/=10;
			count++;

		}
		num=(int) temp;
		System.out.println(num);
		while(num>0)
		{
			digit=num%10;
			if(digit%2==0)
			{
				sum+=digit;
			}
		
			num/=10;
			
		}
		System.out.println("Sum of Even digit from given numbers ="+sum);
		double avg=sum/count;
		System.out.println("Avg of Even digit from given numbers ="+avg);
	}

}
