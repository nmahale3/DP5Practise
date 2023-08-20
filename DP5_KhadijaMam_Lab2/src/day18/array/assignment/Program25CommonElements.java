package day18.array.assignment;

public class Program25CommonElements {

	public static void commonElements(int arr1[],int arr2[])
	{
		for (int i = 0; i < arr1.length; i++) {
			int count=0;
			for (int j = 0; j < arr2.length; j++) {
				if(arr1[i]==arr2[j])
				{
					count++;
				}
			}
			if(count>=1)
			System.out.println(arr1[i]);
		}
	}
	
	
	public static void main(String[] args) {
		int arr1[]= {12, 23, 34, 67 ,78, 91, 56};
		int arr2[]= {39, 25, 15, 23, 55, 91, 66, 22};
		commonElements(arr1,arr2);
	}
}
