package com.tq.day10.polymorphism;

import java.util.Scanner;

public class AreaMain {
	
//	public static void main(String[] args) {
//	
//		Area a = new Area();
//		a.area(5.0f);
//		a.area(12, 10);
//		a.area(10);
//		a.area(5.0f, 10);

	public static void main(String[] args) {

		Area a = new Area();
		Scanner sc=new Scanner(System.in);
		System.out.println("Entre the redius");
		float r=sc.nextFloat();
		a.area(r);
		a.area(12.3, 10.2);
		a.area(10.0);
		a.area(5f, 10f);
		sc.close();

	}
}
	


