package day18.array.assignment;
//4.	WAP to take array and print all positive numbers 
import java.util.Scanner;

public class Program4 {

	public static void positiveNumbers()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter length of an element");
		int num=s.nextInt();
		System.out.println("Length of an array is :"+num);
		int arr[]=new int[num];
		System.out.println("Enter "+num+ " Elements");
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]=s.nextInt();
		}
		System.out.println("Positive Numbers");
		for (int i :arr) 
		{
			if(i>0)
			{
				System.out.print(i+" ");
			}
		}
		s.close();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		positiveNumbers();
	}

}
