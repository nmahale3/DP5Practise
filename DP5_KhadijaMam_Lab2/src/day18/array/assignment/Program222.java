package day18.array.assignment;



public class Program222 {
	
	public static void  primeNumbers(int arr[])
	{
		for (int i = 0; i < arr.length; i++) 
		{
			boolean isPrime=true;
			
			for (int j = 2; j < arr[i]; j++) 
			{
				if(arr[i]%j==0)
				{
					isPrime=false;
					break;
				}
			}
			if(isPrime)
			{
				if(arr[i]==1||arr[i]==2)
				{
					continue;
				}
				System.out.print(arr[i]+" ");
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		
		int a[] = {1,2,3,5,8,10,11,18,25,10,7,41};
		System.out.println("Prime Numbers from given Array elements ");
		primeNumbers(a);
		
	}

}
