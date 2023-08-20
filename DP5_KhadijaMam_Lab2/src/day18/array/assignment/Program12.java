package day18.array.assignment;

public class Program12 {
	
	public static int maxNumber(int arr[])
	{
	int max=arr[0];
	int i,len=arr.length;
	for (i = 1; i < len; i++) {
		if (max<arr[i]) {//arr[i]>max
			max=arr[i];
		} 
	}
	return max;
	}
	
	public static int minNumber(int arr[])
	{
		int min=arr[0];
		int i,len=arr.length;
		for (i = 1; i < len; i++) {
			if (min>arr[i]) //arr[i]<min
				{
				min=arr[i];
			} 
		}
		return min;	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {45,35,10,58,99,65};
	
		System.out.println("Max number is "+maxNumber(num));
		System.out.println("Min number is "+minNumber(num));
	}


}
