package com.customeexception;

import java.util.Scanner;

class VehicleSpeedException extends RuntimeException
{

	public VehicleSpeedException(String message) {
		super(message);
		
	}
	
}

class VehicleSpeed
{
	public static void speed(int speed) {
		if (speed>80) {
			throw new VehicleSpeedException	("Please reduce your Speed");
		} else {
			System.out.println("Continue riding");
		}
	}
}
public class Demo3 {

	public static void main(String[] args) {
		System.out.println("----welcome-----");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your Vehicle Speed");
		int speed = s.nextInt();
		try
		{
		VehicleSpeed.speed(speed);
		}
		catch(VehicleSpeedException e)
		{
//			System.out.println(e);
//			e.printStackTrace();
			System.out.println("Message : "+e.getMessage());
		}
		s.close();
		}
}
