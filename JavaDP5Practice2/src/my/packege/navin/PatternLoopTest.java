package my.packege.navin;

public class PatternLoopTest {
	
	public static void main(String[] args) {
		
		int num=5;
		for(int i=1;i<=num;i++)
		{
			for(int j=num-1;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				if(j%2==0)			
					System.out.print("0");
				else
					System.out.print("1");				
			}
			System.out.println();
		}
	}

}
