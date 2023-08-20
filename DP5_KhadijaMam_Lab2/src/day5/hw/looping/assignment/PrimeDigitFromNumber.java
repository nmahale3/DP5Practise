package day5.hw.looping.assignment;

import java.util.Scanner;

public class PrimeDigitFromNumber {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = s.nextInt();
		s.close();
		int digit = 0;
		while (num>0)
		{
			digit=num%10;
			if(digit==2||digit==3||digit==5||digit==7)
				System.out.println("Prime Digits from the Number\n"+digit);
			num/=10;
		}
	}
}


