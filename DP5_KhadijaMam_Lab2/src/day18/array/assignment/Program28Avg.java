package day18.array.assignment;

import java.util.Arrays;

public class Program28Avg {
	
	public static void average(double arr[])
	{
		double max=arr[0],min=arr[0],sum=0;
		double avg;
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			if(arr[i]<min)
			{
				min=arr[i];
			}
			sum+=arr[i];
			
		}
		double totalSum=sum-max-min;
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.println(max);
		System.out.println(min);
		System.out.println(totalSum);
		avg=(totalSum/arr.length);
		System.out.println(avg);
	}
	
	public static void main(String[] args) {
		double arr[]= {12,13,1,4,55,65,32,43};
		System.out.println("Average of Elements");
		average(arr);
	}
}
