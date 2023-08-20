package day18.array.assignment;

public class Program11 {

	private static void EvenAndOddArray(int arr[]) {
		int newEven[],newOdd[],i,len=arr.length,iOdd=0,iEven = 0;
		newEven= new int[len];
		newOdd=new int[len];
		
		for (i = 0; i < len; i++) {
			if(arr[i]%2==0)
			{
				newEven[iEven]=arr[i];
				iEven++;
			}
			else
			{
				newOdd [iOdd]=arr[i];
				iOdd++;
			}	
		}
		System.out.println("Printing array with even numbers");
		for ( i = 0; i < iEven; i++) {
			System.out.print(newEven[i]+" ");
		}
		System.out.println("\nPrinting array with odd numbers");
		for ( i = 0; i < iOdd; i++) {
			System.out.print(newOdd[i]+" ");
		}
	}
	public static void main(String[] args) {
	int num[] = {2,5,8,97,7,22};
	EvenAndOddArray(num);
}
}
