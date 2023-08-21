package my.packege.navin;

import java.util.Scanner;

public class PositiveFalseThree
{

	static boolean positiveFalse(int num)
	{
		 boolean ispresent = false;
		//		Scanner s = new Scanner(System.in);
		if(num<0)
		{
			ispresent=false;
		}

		else if(num>0)
		{
			while(num>0)
			{
				int rem=num%10;
				if(rem==3)
				{
					ispresent=true;
					break;
				}
				else
				{
					ispresent=false;
				}
				num=num/10;
			}

		}
		else
		{
			ispresent=false;
		}
		return ispresent;
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int num = s.nextInt();
		boolean bs = PositiveFalseThree.positiveFalse(num);
		System.out.println(bs);
		s.close();
	}
}
