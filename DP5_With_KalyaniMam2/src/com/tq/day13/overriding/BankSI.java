package com.tq.day13.overriding;
/*6) A bank has a principal amount and a rate of interest which is 2%.
 * A savings account has a rate of interest 3% while a current account has 5%. 
 * Write a method that displays the rate of interest based on whether the account is default/ savings/ current.
 * */

	class Bank
	{
		double principalAmount=20000;
		public void rate(double a)
		{
			System.out.println("principal amount is: "+principalAmount);
			System.out.println("rate of interest is "+a+"%");
		}
	}
	class SavingsAccount extends Bank
	{
		public void rate(double a)
		{
			System.out.println("saving account has rate of interest is "+a+"%");
		}
	}
	class CurrentAccount extends Bank
	{
		public void rate(double a)
		{
			System.out.println("current account has rate of interest is "+a+"%");
		}
	}
	public class BankSI {
		public static void main(String args[])
		{
			Bank b = new Bank();
			b.rate(2);
			SavingsAccount s = new SavingsAccount();
			s.rate(3);
			CurrentAccount c = new CurrentAccount();
			c.rate(5);
		}
	}
 	