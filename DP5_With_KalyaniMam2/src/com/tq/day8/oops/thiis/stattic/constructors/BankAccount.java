package com.tq.day8.oops.thiis.stattic.constructors;

import java.util.Scanner;

class Bank_Account {

	int acId;
	String customerName;
	double balance;


	public void acceptDetail(int acId,String customerName,double balance) 
	{
		this.acId= acId;
		this.customerName = customerName;
		this.balance = balance;
	}

	public void displayBankDetails()
	{
		System.out.println("Your Account id : "+acId);
		System.out.println("Customer Name : "+customerName);
		System.out.println("Your Account balance : "+balance);	

	}


	public void withdrawBalance()
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter amount you want to withdraw");
		int withDraw=s1.nextInt();
		double totalBalance=balance-withDraw;
		System.out.println("Your total balance is : "+totalBalance);
		
		
	}
	public void addDeposite()
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter amount you want to withdraw");
		int deposite=s1.nextInt();
		double totalBalance=balance+deposite;
		System.out.println("Your total balance is : "+totalBalance);
		s1.close();
		
	}
	
	}
public class BankAccount
{
	
	public static void main(String[] args)
	{
	
		Scanner s = new Scanner(System.in);
		Bank_Account b = new Bank_Account();
		System.out.println("Your Account id :");
		System.out.println("Customer Name : ");
		System.out.println("Your Account balance : ");	
		b.acceptDetail(s.nextInt(),s.next(), s.nextDouble());
		b.displayBankDetails();
		System.out.println("Enter options");
		System.out.println("1.Deposite \n2.Withdraw");
		int choice=s.nextInt();
		if(choice==1)
		{
			b.addDeposite();
		}
		else if (choice==2)
		{
		b.withdrawBalance();	
		}
		s.close();
	}
}
