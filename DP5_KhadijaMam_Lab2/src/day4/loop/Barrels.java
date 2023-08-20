package day4.loop;
import java.util.*; 
public class Barrels {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Enter the number of barrels");
		int quantity = s.nextInt();
	
		for(int i = 1; i<=quantity;i++)
		{
			int price = 89;
			if(i<=10)
			{
			price = price*i;	
				System.out.println("Price for "+i+" barrels = "+price);
			}			
			
			else 
			{
				price=(i*price)-i;
				System.out.println("Price for "+i+" barrels = "+price);	
			}

		}
		
		s.close();
	}
}
