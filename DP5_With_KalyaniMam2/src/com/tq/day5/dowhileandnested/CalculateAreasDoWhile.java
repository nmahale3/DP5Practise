package com.tq.day5.dowhileandnested;

import java.util.Scanner;

public class CalculateAreasDoWhile {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char ch;		
		do 
		{

			System.out.println("Menu:\n1.Area of Circle\n2.Area of Rectangle\n3.Area of Triangle\n4.Area of Square");
			System.out.println("Enter your choice");
			int choice=s.nextInt();
			switch (choice) 
			{
			case 1:
				System.out.println("Enter the Radius of the Circle");
				int r=s.nextInt();
				double pi=3.14;
				double areaOfCircle=pi*r*r;
				System.out.println("Area of Circle = "+areaOfCircle);
				break;
			case 2:
				System.out.println("Enter the Length of Rectangle");
				int length=s.nextInt();
				System.out.println("Enter the Width of Rectangle");
				int width=s.nextInt();
				int areaOfRectangle=length*width;
				System.out.println("Area of Rectange = "+areaOfRectangle);
				break;
			case 3:
				System.out.println("Enter the Height of Triangle");
				int height=s.nextInt();
				System.out.println("Enter the Base of Triangle");
				int base=s.nextInt();
				int areaOfTriangle=(int)((1/2)*base*height);
				System.out.println("Area of Triangle = "+areaOfTriangle);
				break;
			case 4:
				System.out.println("Enter the Side of Square");
				int side=s.nextInt();
				int areaOfSquare=side*side;
				System.out.println("Area of Square = "+areaOfSquare);
				break;

			default:
				System.out.println("Please Enter valid input");
				break;
			}
			System.out.println("Do you want to continue?");
			ch = s.next().charAt(0);
		}while(ch=='y'||ch=='Y');
		s.close();

	}

}
