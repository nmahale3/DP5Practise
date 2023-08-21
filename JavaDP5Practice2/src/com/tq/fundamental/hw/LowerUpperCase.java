package com.tq.fundamental.hw;

import java.util.Scanner;

public class LowerUpperCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character to chaeck case of the Character");
		char ch = sc.next().charAt(0);
		if (ch>='a'&&ch<='z')
		{
			System.out.println(ch+" Lowercase");
		}
		else if (ch>='A'&&ch<='Z')
		{
			System.out.println(ch+" Uppercase");
		}
		else
		{
			System.out.println("Enter valid character");
		}
		sc.close();
	}

}
