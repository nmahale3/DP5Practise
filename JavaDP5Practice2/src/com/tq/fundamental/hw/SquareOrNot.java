package com.tq.fundamental.hw;

import java.util.Scanner;

public class SquareOrNot {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Length : ");
		double length = input.nextDouble();
		System.out.println("Enter Breadth : ");
		double breadth = input.nextDouble();
		if(length==breadth)
		{
			System.out.println("it is Square : "+(length*breadth));
		}
		else
			System.out.println("it is not Square");
		input.close();	
	}

}
