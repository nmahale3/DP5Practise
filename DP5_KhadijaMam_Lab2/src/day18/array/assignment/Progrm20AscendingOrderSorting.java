package day18.array.assignment;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Progrm20AscendingOrderSorting {

	public static void ascendingSorting(int a[]) {
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					}
			//	System.out.print(a[i]+" ");		
			}
		}System.out.println(Arrays.toString(a));
	}
	
	public static void main(String[] args) {
		int a[]= {98,7,6,45,32,65,69,36,22,1,4};
		ascendingSorting(a);

	}

}
