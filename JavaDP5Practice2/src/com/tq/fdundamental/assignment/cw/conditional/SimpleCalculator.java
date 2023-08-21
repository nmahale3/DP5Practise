package com.tq.fdundamental.assignment.cw.conditional;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers :");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println("Menu:\n+ Addition\n- Substraction\n* Multiplication\n/ Division\n% Modulus");
		System.out.println("Enter a Charecter:");
		char ch = sc.next().charAt(0);
		if(ch=='+')
		{
			int add=num1+num2;
			System.out.println("Addition of "+num1+" + "+num2+" = "+add);
		}
		else if(ch=='-')
		{
			int sub=num1-num2;
			System.out.println("Substraction of "+num1+" - "+num2+" = "+sub);
		}
		else if(ch=='*')
		{
			int mul=num1*num2;
			System.out.println("Multiplication of "+num1+" * "+num2+" = "+mul);
		}
		else if(ch=='/')
		{
			int div=num1/num2;
			System.out.println("division of "+num1+" / "+num2+" = "+div);
		}
		else if(ch=='%')
		{
			int mod=num1%num2;
			System.out.println("Modulus of "+num1+" % "+num2+" = "+mod);
		}
		else
		{
			System.out.println("Enter Valid Character");
		}

		sc.close();

	}

}
