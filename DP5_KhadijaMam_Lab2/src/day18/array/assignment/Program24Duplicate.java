package day18.array.assignment;

import java.util.Arrays;

public class Program24Duplicate 
{

	public static void main(String[] args)
	{
        int[] array = {3, 10, 90, 78, 56, 10, 78, 34, 61};
        int i, j;
        int count;
//        boolean found;
        
        for (i = 0; i < array.length; i++)
        {
//            found = false;
            count=0;
            for (j = i + 1; j < array.length; j++) 
            {
                if (array[i] == array[j])
                {
                    System.out.println(array[i]);
//                    found = true;
                    count++;                    
                    break;
                }
            }
        }
	}
}
