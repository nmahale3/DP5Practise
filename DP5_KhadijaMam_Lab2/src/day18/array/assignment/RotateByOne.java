package day18.array.assignment;

import java.util.Arrays;

public class RotateByOne 
{
	public static void rotation(int []arr)
	{
		int lastIndex=arr.length-1;
		int lastIndexElement=arr[arr.length-1];
		for (int  i = arr.length-2;i >= 0; i--)
		{
			arr[lastIndex]=arr[i];
			lastIndex--;
			if (i==0) {
				arr[i]=lastIndexElement;
			}	
		}
		System.out.println(Arrays.toString(arr));
		
	}
	public static void main(String[] args) 
	{
		int[] arr= {1,2,3,4,5};
		//output should be [5,1,2,3,4]
		rotation(arr);
	}
}
