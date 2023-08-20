package day5.hw.looping.assignment;

import java.util.Scanner;

public class KaprekarsNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int sqr=num*num;		
		int temp=num,sum=0,rem,pov=1,count=0,digit,dig1=0;
		while(num>0)
		{
			rem=num/10;
			count++;
			num/=10;
		}		
		System.out.println(count);
		
		for(int i=1;i<=count;i++)
		{
			pov=pov*10;
		}
		System.out.println(pov);
		while(sqr>0)
		{
			digit=sqr%pov;
			sqr=sqr/pov;
			dig1=sqr+digit;		
		}
			System.out.println(dig1);
	}
}
