package com.tq.fundamental.hw;
import java.util.Scanner;
public class AttendanceofStudent 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of class held");
		int classHeld = sc.nextInt();
		System.out.println("Enter the number of class Attended by student");
		int classAttended = sc.nextInt();
		int totalPercentage;
		totalPercentage=(classHeld/classAttended)*100;
		if(totalPercentage>=75)
		{
			System.out.println("Student having "+totalPercentage+"% Attendance and he/she is eligibile to sit in Exam");
		}
		else
		{
			System.out.println("Student having "+totalPercentage+"% Attendance and he/she isn't eligibile to sit in Exam");
		}
		sc.close();
	}
}
