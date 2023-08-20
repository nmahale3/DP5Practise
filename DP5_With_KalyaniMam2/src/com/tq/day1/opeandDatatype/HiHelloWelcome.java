package com.tq.day1.opeandDatatype;
import java.util.Scanner;
public class HiHelloWelcome {
	public static void main(String[] args){

		Scanner inpu = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = inpu.nextInt();
		if (num%5==0&&num%3==0)
		{
			System.out.println("Welcome...........");
		}
		else if (num%5==0)
		{
			System.out.println("Helllooooo...........");
		}
		else if(num%3==0)
		{
			System.out.println("Hiiiii..........");
		}
		else 
		{
			System.out.println("Number isnt divisible by 3 and 5");
		}
		inpu.close();
	}

}
