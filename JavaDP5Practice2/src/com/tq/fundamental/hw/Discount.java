package com.tq.fundamental.hw;
import java.util.Scanner;

public class Discount {

	public static void main(String []args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Quantity");
		int quantity = input.nextInt();
		float discount;
		int cost = 100;
		int bill=cost*quantity;
		float totalBill;
		if(quantity>1000)
		{
			discount = (float) 0.1*bill;
			totalBill=bill-discount;
			System.out.println("Toatl bill after 10% discount "+totalBill);
		}
		else if (quantity>0&&quantity<=1000)
		{
			totalBill = (float) bill;
			System.out.println("Toatl bill without discount "+totalBill);
		}
		input.close();
	}
}
