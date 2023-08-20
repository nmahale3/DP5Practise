package day4.loop;

import java.util.Scanner;
//You have hundred items (1,2,3,…100) 
//the price of each item is the same as its number. 
//i.e., item 1 is of 1 rs. Item 2 is of 2 rs. And so on.
//Calculate the total of the items.

public class TotalPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the item number");
		int item = s.nextInt();
		int price =0;
		for(int i =1;i<=item;i++)
		{
			price=(price)+i;
		}
		System.out.println(price);
		s.close();
	}

}
