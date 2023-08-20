package com.tq.day2.conditionalstatement;
import java.util.Scanner;
public class OddEvenSwitch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		System.out.println("Enter choice");
		int choice=sc.nextInt();
		switch(choice%2)
		{
		case 0 :
			System.out.println(num+" is Even");
			break;
		case 1:
			System.out.println(num+" is Odd");
			break;
		}
		sc.close();
	}
}
