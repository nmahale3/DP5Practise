package my.packege.navin;

import java.util.Scanner;

public class Prime {
	static Scanner sc = new Scanner(System.in);

	public static void primeUptoNumber() 
	{
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int sum = 0;
		for (int i = 0; i < num; i++) {
			int count = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					count++;
					sum = sum + i;
					break;
				}
			}
			if (count == 0) {
				System.out.println(i);
			}
			System.out.println(sum);
		}
	}

	public static void primeBetweenRange() 
	{
		System.out.println("Enter the Starting range");
		int startRange=sc.nextInt();
		System.out.println("Enter the Ending range");
		int endRange=sc.nextInt();
		for (int i = startRange; i < endRange; i++) {
			boolean checkPrime=true;
			for (int j = 2; j < i; j++) {
				if (i%j==0) {
					checkPrime=false;
					break;
				}
			}
			if (checkPrime) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
//		primeUptoNumber();
	primeBetweenRange();
	}

}
