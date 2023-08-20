package com.tq.day5.dowhileandnested;

import java.util.Scanner;

public class CalculatorDoWhile {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		char ch;
		do {
			System.out.println("Menu\n1.Addition\n2.Substraction\n3.Multiplication\n4.Division");
			System.out.println("Enter your choice");
			int choice=s.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter First number");
				int num1=s.nextInt();
				System.out.println("Enter Second number");
				int num2=s.nextInt();
				int add=num1+num2;
				System.out.println("Addition of Numbers = "+add);
				break;
			case 2:
				System.out.println("Enter First number");
				int num=s.nextInt();
				System.out.println("Enter Second number");
				int num_=s.nextInt();
				int sub=num-num_;
				System.out.println("Substraction of Numbers = "+sub);
				break;
			case 3:
				System.out.println("Enter First number");
				int mul1=s.nextInt();
				System.out.println("Enter Second number");
				int mul2=s.nextInt();
				int mul=mul1-mul2;
				System.out.println("Multiplication of Numbers = "+mul);
				break;
			case 4:
				System.out.println("Enter First number");
				int div1=s.nextInt();
				System.out.println("Enter Second number");
				int div2=s.nextInt();
				int div=div1-div2;
				System.out.println("Division of Numbers = "+div);
				break;
			default:
				System.out.println("Enter Valid Choice");
				break;
			}
			System.out.println("Do you want to continue?");
			ch=s.next().charAt(0);

		}
		while(ch=='y'||ch=='Y');
		s.close();
	}

}
