package day5.whileloop;

import java.util.Scanner;

public class MaxEleemntfromNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		s.close();
		int max=0;
		int min=num%10;
		
		while(num>0)
	
		{
		int rem = num%10;
		if(rem>max)
		{
			max=rem;
		}
		if(rem<min)
		{
			min=rem;
		}
	
		num/=10;
		}
		System.out.println("Max number is "+max);
		System.out.println("Min number is "+min);
	}

}
