package day6.pattern;

import java.util.Scanner;

public class MilkOil1
{
	int currency=100;
	static void money()
	{
/*	Scanner s= new Scanner(System.in);
		int totalMoney=0;
		int count=0;
		while(true)
		{
			System.out.println("Enter the Litre of milk do you Want?");
			int milkLiter=s.nextInt();
			System.out.println("Enter the Litre of oil do you Want?");
			int oilLiter=s.nextInt();

			int totalMilk=(40*milkLiter);
			int totalOil=(50*oilLiter);
			totalMoney=totalMoney+totalOil+totalMilk;
			if(totalMoney<=500)
			{
				System.out.println(totalMoney);
				count++;
				
			}
			else
			{
				System.out.println("Exhaust money");
				break;
			}
				
			
		}
		System.out.println("You got total "+count+" counts to spent 500 rs");
	*/
		MilkOil1 m=new MilkOil1();
		m.currency = 200;
		System.out.println(m.currency);
	}

	
	public static void main(String[] args) {
		MilkOil1.money();
	}
}
