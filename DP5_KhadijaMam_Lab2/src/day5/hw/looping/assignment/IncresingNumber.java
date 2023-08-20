package day5.hw.looping.assignment;

import java.util.Scanner;

public class IncresingNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any Number");
		int num = s.nextInt();
		int digit=num%10;
		num/=10;
		boolean isIncrease = true; 
		while (num>0) 
		{
			if (digit<=num%10) {
				isIncrease=false;
				break;
			}
			digit = num%10;
//			num=num/10;
		}
		if (isIncrease)
		{
			System.out.println("Digits are in increasing order");
		} 
		else
		{
			System.out.println("Digits are not in increasing order");
		}
		s.close();
	}

}
