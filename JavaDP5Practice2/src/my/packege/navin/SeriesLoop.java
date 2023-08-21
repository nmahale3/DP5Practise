package my.packege.navin;

import java.util.Scanner;

public class SeriesLoop {
	
	static void Series(int num)
	{
		for (int i=1;i<=num;i++)
		{
//			int ans=((i*i)+(2*i));
//		int ans = (2*i)+1;   bhushan
//			System.out.print(ans+" ");
			
			for (int j = i; j >=1; j--) {
				System.out.print(j);
			}
			System.out.println();
	
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range of series");
		int num=sc.nextInt();
		SeriesLoop.Series(num);
		sc.close();
	}
}
