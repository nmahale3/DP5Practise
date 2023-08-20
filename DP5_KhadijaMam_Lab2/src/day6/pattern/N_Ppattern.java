package day6.pattern;

public class N_Ppattern {
	public static void main(String[] args) {
		System.out.println("====================================");
		System.out.println("Print N");
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j==1||j==5||i==j)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("====================================");
		System.out.println("Print P");
		for (int i = 1; i <=5; i++) 
		{
			for (int j = 1; j <=5; j++) {
				if(i==1||i==3||j==1||(i==2&&j==5))
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
