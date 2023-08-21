package my.packege.navin;
import java.util.*;
public class Series {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the range");
		int num=s.nextInt();
		int n=1;
		int n2=2;
		System.out.print(n+" "+n2+" ");
//		int n,n2;
		for(int i=1;i<=num;i++)
		{
			n=((2*n)+1);
			System.out.print(n+" ");
			
			n2=((2*n2)-1);
			System.out.print(n2+" ");		
		}
s.close();
	}

}
