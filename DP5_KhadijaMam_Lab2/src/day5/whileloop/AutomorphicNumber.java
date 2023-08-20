package day5.whileloop;


import java.util.Scanner;

public class AutomorphicNumber {

	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		System.out.println("Enter the number to check Automorphic");
		int num=c.nextInt();
		c.close();
		int count=0;
//		int sqr=num*num;
		int cube=num*num*num;
		int temp=num;
		while(temp>0)
		{
			count++;
			temp=temp/10;
		}
		int num2 = (int)(cube%(Math.pow(10, count)));
		if (num==num2) {
//			System.out.println(num +" = Automorphic Number");
			System.out.println(num +" = trimorphic Number");

		}
		else {
//			System.out.println(num +" is not an Automorphic Number");
			System.out.println(num +" = trimorphic Number");

		}
	}

}
