package day19.Array2;

import java.util.Scanner;

public class ReplaceZeroByOneInArray {
	
	public static void replaceZeroByOne(int arr[])
	{
		int i,len=arr.length;
		for(i=0;i<len;i++)
		{
			if(arr[i]==0)
			{
				arr[i]=1;
			}
			System.out.print(arr[i]+" ");
		}
		
	}

	public static void main(String[] args) {
		int num[] = {78,2,55,0,8,42,79,0,0,69};
		Scanner s= new Scanner(System.in);
		replaceZeroByOne(num);
	}
}
