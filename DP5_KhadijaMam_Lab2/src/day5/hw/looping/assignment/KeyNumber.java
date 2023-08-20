package day5.hw.looping.assignment;

import java.util.Scanner;

public class KeyNumber {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int key;
		int count=0;
		int keyNum=4;
//		while(true)
		do
		{
			System.out.println("Enter Key");
			key=s.nextInt();
			if(key>keyNum)
			{
				System.out.println("please enter small key");
				count++;
			}			
			else if(key<keyNum)//if(key<4)
			{
				System.out.println("Please Enter large key");
				count++;
			}			
			else//if(key==4)
			{
				System.out.println("Congratulation!!!!!!\nYour Guessing is correct");
//				count++;
				break;
			}
		}
		while(true);
		System.out.println("you have used "+count+" counts for correct guessing");	
		s.close();
	}

}
