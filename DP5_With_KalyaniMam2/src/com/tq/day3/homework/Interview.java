package com.tq.day3.homework;

public class Interview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <=20; i++)
		{
		if (i%3==0&&i%5==0) {
			System.out.println("OnexTel");
		}	
		else if(i%3==0)
		{
			System.out.println("Onex");
		}
		else if(i%5==0)
		{
			System.out.println("Tel");
		}
		else
			System.out.println(i);
		}
	}

}
