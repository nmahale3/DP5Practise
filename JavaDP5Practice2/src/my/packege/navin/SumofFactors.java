package my.packege.navin;


import java.util.Scanner;

public class SumofFactors {

	public void sumOfFactor()
	{
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int temp=num;
		for (int i = 1; i <num; i++)
		{
			if(num%i==0)
			{
				System.out.print(i+" ");
				sum+=i;
			}
			
		}
		System.out.println("\n"+sum);
		if(temp==sum) {
			System.out.println("Perfect number");
		}
		else
		{
			System.out.println("Not Perfect number");
		}
		sc.close();

	}

	public static void main(String[] args) {
		SumofFactors s=new SumofFactors();
		s.sumOfFactor();
	}

}
