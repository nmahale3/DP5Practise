package day3.topic;

import java.util.Scanner;

public class Banks {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int fixedBalance=500000;
		int deposite;
		int withdraw;
		int toatalBalance;
		int pin=1234;
		System.out.println("Enter your pin");
		int pin1=sc.nextInt();
		if (pin1==pin)
			
		{
			System.out.println("Enter Your Choice \n1.Deposite\n2.Withdraw\n3.Check Balance\n4.Exit");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1: 
				System.out.println("Enter Amount for Deposite");
				deposite=sc.nextInt();
				toatalBalance=fixedBalance+deposite;
				System.out.println("Congratulations you have deposite "+deposite+" rs and your total balance is "+toatalBalance+" rs");
				break;
			case 2: 
				System.out.println("Enter Amount for Withdraw");
				withdraw=sc.nextInt();
				if(fixedBalance>=withdraw)
				{
				toatalBalance=fixedBalance-withdraw;
				System.out.println("Congratulations you have Withdraw "+withdraw+" rs and your total balance is "+toatalBalance+" rs");
				}
				else
					System.out.println("Insufficient Balance to Withdraw");
				break;
			case 3: 
				toatalBalance=fixedBalance;
				System.out.println("Your Total balance is"+toatalBalance);
				break;
			case 4:
				System.out.println("Thanks For using our Service");
				
			}
			
		}
		else
			System.out.println("Please Enter Valid Pin");
		sc.close();
	}

}
