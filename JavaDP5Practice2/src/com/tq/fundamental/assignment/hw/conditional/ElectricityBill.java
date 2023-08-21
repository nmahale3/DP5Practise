package com.tq.fundamental.assignment.hw.conditional;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter units consumption");
		int unit = sc.nextInt();
		System.out.println("Enter amount of bill");	
		double bill=sc.nextDouble(); 
		if(unit>0&&unit<=50)
		{
			 bill = (0.50*bill)+bill;
			System.out.println("Total bill for "+unit+" is "+bill+" Rs");
		}
		else if (unit>50&&unit<=150) {
			bill = (0.75*bill)-(0.50*bill)+bill;
			System.out.println("Total bill for "+unit+" is "+bill+" Rs");
		}
		else if (unit>150&&unit<=250) {
			bill = -(0.50*bill)-(0.75*bill)+(bill*1.2)+bill;
			System.out.println("Total bill for "+unit+" is "+bill+" Rs");			
		}
		else
		{
			bill = -(0.50*bill)-(0.75*bill)-(bill*1.2)+(1.5*bill)+(0.20*bill)+bill;
			System.out.println("Total bill for "+unit+" is "+bill+" Rs");	
		}
		sc.close();

	}

}
