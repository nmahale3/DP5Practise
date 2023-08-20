package com.tq.day1.opeandDatatype;

import java.util.Scanner;

public class Cubes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check its cube");
		int num = sc.nextInt();
		int cube = (num*num*num);
		System.out.println(num+" cube is "+cube);
		sc.close();
	}
}
