package com.tq.fdundamental.assignment.cw.conditional;

import java.util.Scanner;

public class ConsonentVowel {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Alphabet");
		char ch = sc.next().charAt(0);
	/*	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		{
			System.out.println("Entered Alphabet is Vowel");
		}
		else
		System.out.println("Entered Alphabet is Consonent");*/
		// using Switch case
	switch (ch)
	{
	case 'a','e','i','o','u':
	{
		System.out.println("Entered Alphabet is Vowel");
		break;
	}

	case 'A','E','I','O','U':
	{
		System.out.println("Entered Alphabet is Vowel");
		break;
	}

	default:
		System.out.println("Entered Alphabet is Consonent");
	}
	sc.close();
	}

}
