package com.tq.fundamental.assignment.hw.conditional;

import java.util.Scanner;

public class AlphaCharDigit {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any key to check its Alphabet , Digit or Special Character ");
		char ch = sc.next().charAt(0);
		if(ch>='0'&&ch<='9')
		{
			System.out.println("the entered key is Digit");
		}
		else if ((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
		{
			System.out.println("the entered key is an Alphabet");
		}
		else 
		{
				System.out.println("the entered key is Special Character");
		}
		sc.close();
		
	}

}
