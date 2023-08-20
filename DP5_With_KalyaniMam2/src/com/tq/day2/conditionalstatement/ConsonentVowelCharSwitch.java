package com.tq.day2.conditionalstatement;

import java.util.Scanner;

public class ConsonentVowelCharSwitch {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter any character");
		char ch = sc.next().charAt(0);
		switch(ch)
		{
		case 'a','e','i','o','u','A','E','I','O','U':
			System.out.println(ch+" is Vowel");
		break;
		default:
			System.out.println(ch+" is Consonent");
		}
		sc.close();
		
	}

}
