package com.tq.day2.conditionalstatement;

import java.util.Scanner;

public class PosNegZeroUsingTernary {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		String result = (num>0)?"Positive":(num<0)?"Negative":"Zero";
		System.out.println("Number is "+result);
		sc.close();
	}

}
