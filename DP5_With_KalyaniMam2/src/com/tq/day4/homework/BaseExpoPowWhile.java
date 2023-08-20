package com.tq.day4.homework;
import java.util.*;

public class BaseExpoPowWhile {

	public static void main(String []args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Base");
		int base = s.nextInt();
		System.out.println("Enter the Exponent");
		int expo = s.nextInt();
		int pov=1;
		int i =1;
		while(i<=expo)
		{
			pov*=base;
			i++;
		}
		System.out.println(base+"^"+expo+"="+pov);
		s.close();
	}
}
