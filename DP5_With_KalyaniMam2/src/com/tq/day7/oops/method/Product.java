package com.tq.day7.oops.method;

import java.util.Scanner;

public class Product {

	int pId;
	String pName;
	double pPrice;
	int pQuantity;
	double totalBill;

	public void productDetails(int id,String name,double price,int quantity) 
	{
		pId=id;
		pName=name;
		pPrice=price;
		pQuantity=quantity;
	}

	public void billCalculation() 
	{
		totalBill=(pPrice*pQuantity);
	}

	public void showAllDetails()
	{
		System.out.println("Product Id = "+pId);
		System.out.println("Product Name = "+pName);
		System.out.println("Product Quantity = "+pQuantity);
		System.out.println("Product Price = "+pPrice);
		System.out.println("Total Bill = "+totalBill);
		}
		


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Product p1 = new Product();
		System.out.println("Enter Product Quantity");
		p1.pQuantity=sc.nextInt();
		if(p1.pQuantity>0)
		{
			System.out.println("Enter Product Id");
			p1.pId=sc.nextInt();
			System.out.println("Enter Product Name");
			sc.nextLine();
			p1.pName=sc.nextLine();
			System.out.println("Enter Product Price");
			p1.pPrice=sc.nextDouble();
			p1.billCalculation();
			p1.showAllDetails();
		}
		else
		{
			System.out.println("Purchase Atleast 1 Product");
		}
		
		sc.close();


	}

}
