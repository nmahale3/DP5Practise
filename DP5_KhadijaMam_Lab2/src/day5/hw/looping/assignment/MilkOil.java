package day5.hw.looping.assignment;

import java.util.Scanner;

public class MilkOil {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int totalMoney=0;
		while(true) 
		{
			System.out.println("Enter the Litre of milk do you Want?");
			int milkLiter=s.nextInt();
			System.out.println("Enter the Litre of oil do you Want?");
			int oilLiter=s.nextInt();

			int totalMilk=(40*milkLiter);
			int totalOil=(50*oilLiter);		
			totalMoney=totalMoney+(totalOil+totalMilk);
			
			if(oilLiter>=0&&milkLiter>=0)
			{
				if(totalMoney<500)
				{
					System.out.println(totalMoney);		
				}
				else
				{
					System.out.println("Your have Exhausted you money");
					break;
				}
			}
			
		}
		s.close();
	}
}
