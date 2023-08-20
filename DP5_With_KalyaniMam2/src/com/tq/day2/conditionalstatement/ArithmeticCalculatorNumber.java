package com.tq.day2.conditionalstatement;

import java.util.Scanner;

public class ArithmeticCalculatorNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First number");
		int num1 = sc.nextInt();
		System.out.println("Enter the Second number");
		int num2 = sc.nextInt();
		System.out.println("Enter Following choice to perform Operation\n1.Addition\n2.Substraction\n3.Multiplication\n4.Division");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Addition of "+num1+" and "+num2+" = "+(num1+num2));
			break;
		case 2:
			System.out.println("Substraction of "+num1+" from "+num2+" = "+(num1-num2));
			break;
		case 3:
			System.out.println("Multiplication of "+num1+" into "+num2+" = "+(num1*num2));
			break;
		case 4:
			System.out.println("Division of "+num1+" by "+num2+" = "+(num1/num2));
			break;

		default:
			System.out.println("Enter Valid Choice");
			break;
		}
		sc.close();
	}

}
