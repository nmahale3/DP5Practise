package day19.Array2;

import java.util.Scanner;

public class SearchElement {

	private static void searchElementInArray(int arr[],int searchEle) {
		int i, len=arr.length,position=-1;
		for (i = 0; i < len; i++)
		{
			if (searchEle==arr[i])
			{
				position=i;
				break;
			}
		}
		if (position!=-1)
		{
		System.out.println(searchEle+" is present at index "+position);	
		}
		else
		{
			System.out.println(searchEle+" is not present in array ");	
		}
	}

	public static void main(String[] args) {
		int num[]= {23,45,63,6,7,88};
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number which you want to search :");
		int search=sc.nextInt();
		searchElementInArray(num, search);
		sc.close();
	}
}
