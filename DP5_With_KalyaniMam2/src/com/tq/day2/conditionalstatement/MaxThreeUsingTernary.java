package com.tq.day2.conditionalstatement;

import java.util.Scanner;

public class MaxThreeUsingTernary {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Three numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
//		int num=(num1>num2&&num1>num3)?num1:(num2>num3)?num2:num3;
//		System.out.println(num);
		String num=(num1>num2&&num1>num3)?"num1 is greater":(num2>num3)?"num2 is greater":"num3 is greater";
		System.out.println(num);
		sc.close();
	}

}
