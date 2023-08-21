package my.packege.navin;

import java.util.Scanner;

class Frequency{

	public void frequencyDigit(int num) {

		int temp;
		System.out.println("Digit\tCount");
		for(int i=0;i<=9;i++) 
		{
			temp=num;	
			int count=0;
			while(temp>0)
			{
				int digit=temp%10;
				if(digit==i)
				{
					count++;
				}
				temp/=10;
			}
			if(count>0) 
			{
				System.out.println(i+"\t"+count);
			}
		}
	}

}


public class NumberFrequency {
	public static void main(String[] args) {


		Frequency f= new Frequency();
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the number");
		int num=s.nextInt();
		f.frequencyDigit(num);
		s.close();
	}

}