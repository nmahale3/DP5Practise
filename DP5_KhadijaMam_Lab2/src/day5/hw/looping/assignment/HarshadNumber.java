package day5.hw.looping.assignment;

import java.util.Scanner;
//if number is 156, then sum of its digit will be 1 + 5 + 6 = 12. Since 156 is divisible by 12. So, 156 is a Harshad number.
public class HarshadNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int sum=0,temp=num,digit;
		
		while (num>0)
		{
			digit=num%10;
			sum+=digit;
			num/=10;
		}
		System.out.println(sum);
		
		if(temp%sum==0)
		{
			System.out.println(temp+" Harshad Number");
		}
		else
		{
			System.out.println("Not Harshad Number");
		}
		sc.close();
	}

}
