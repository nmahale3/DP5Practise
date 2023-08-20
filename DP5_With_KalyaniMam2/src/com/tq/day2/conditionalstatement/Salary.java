package com.tq.day2.conditionalstatement;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the level of an Employee");
		String str = input.nextLine();
		switch(str)
		{
		case "beginner":
			System.out.println("Congrats you got salary");
			break;
		case "intermediate":
			System.out.println("Congrats you got good salary");
			break;
		case "expert":
			System.out.println("Congrats you got higher salary");
			break;
		default : 
			System.out.println("Enter valid level of an Employee");
		}
		input.close();
	}

}
