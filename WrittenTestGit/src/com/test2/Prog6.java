package com.test2;

import java.util.Scanner;

class NumberProgram{
//	private int number;

//	public NumberProgram(int number) 
//	{
//		this.number = number;
//	}

	public void printNumberInWord(int number)
	{

		switch(number)
		{
		case 0 :
			System.out.println("Zero");
			break;
		case 1 :
			System.out.println("One");
			break;
		case 2 :
			System.out.println("Two");
			break;
		case 3 :
			System.out.println("Three");
			break;
		case 4 :
			System.out.println("Four");
			break;
		case 5 :
			System.out.println("Five");
			break;
		case 6 :
			System.out.println("Six");
			break;
		case 7 :
			System.out.println("Seven");
			break;
		case 8 :
			System.out.println("Eight");
			break;
		case 9 :
			System.out.println("Nine");
			break;
		default:
			System.out.println("Please enter valid number");
		}

	}
}

public class Prog6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number between 0 to 9");
		int number=sc.nextInt();
		NumberProgram np=new NumberProgram();
		np.printNumberInWord(number);
		sc.close();

	}
}
