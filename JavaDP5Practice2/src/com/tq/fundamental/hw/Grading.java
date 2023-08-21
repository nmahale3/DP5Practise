package com.tq.fundamental.hw;

import java.util.Scanner;

public class Grading {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the marks obtained by student");
		int marks = input.nextInt();
		if(marks<25&&marks>0)
			System.out.println("The student obtained "+marks+" and he/she is failed");
		else if(marks>=25&&marks<45)
			System.out.println("The student obtained "+marks+" and he/she is passed with E grade");
		else if(marks>=45&&marks<50)
			System.out.println("The student obtained "+marks+" and he/she is passed with D grade");
		else if(marks>=50&&marks<60)
			System.out.println("The student obtained "+marks+" and he/she is passed with C grade");
		else if(marks>=60&&marks<80)
			System.out.println("The student obtained "+marks+" and he/she is passed with B grade");
		else if(marks>=80&&marks<100)
			System.out.println("The student obtained "+marks+" and he/she is passed with A grade");
		else
			System.out.println("Enter Valid Marks");
		input.close();

	}

}
