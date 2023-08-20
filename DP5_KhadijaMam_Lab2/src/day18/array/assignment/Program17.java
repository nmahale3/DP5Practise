package day18.array.assignment;
/*17.WAP to merge 2 arrays to 3rd array.
 * 3rd array should not have elements of same value.
 */
import java.util.*;

public class Program17
{
	public static void mergingElements(int arr1[],int arr2[])
	{
		Scanner s = new Scanner(System.in);
		
		int len=arr1.length+arr2.length;
		int i,j;
		System.out.println("Enter Elements of array 1");
		for (i = 0; i < arr1.length; i++) {
			arr1[i]=s.nextInt();
		}
		System.out.println("Enter Elements of array ");
		for ( j = 0; j < arr2.length; j++) {
			arr2[j]=s.nextInt();
		}
		
		int arr3[]=new int[len];
		j=0;
		for(int k=0;k<len;k++)
		{
			if(k<arr1.length) 
			{
			arr3[j]=arr1[k];
			j++;
			}
			if(k<arr2.length)
			{
				arr3[j]=arr2[k];
				j++;
			}
//			System.out.println(arr3[j]);
		}
//		 logic for alternate merging 
//		 j=0;
//		 	for(int k=0;k<arr3.length;k++)
//		{
//			if(k<arr1.length) 
//			{
//			arr3[j]=arr1[k];
//			j++;
//			}
//			if(k<arr2.length)
//			{
//				arr3[j]=arr2[k];
//				j++;
//			}
//		}
//		
		
		
		System.out.println(Arrays.toString(arr3));
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the size of an Array 1");
		int size1=sc.nextInt();
		int arr1[]=new int[size1];
		
		
		System.out.println("Enter the size of an Array 2");
		int size2=sc.nextInt();
		int arr2[]=new int[size2];
		
		mergingElements(arr1, arr2);
		
		
	}
}