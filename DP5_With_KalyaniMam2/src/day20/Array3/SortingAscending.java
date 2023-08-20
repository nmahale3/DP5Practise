package day20.Array3;

public class SortingAscending {

	public static int[] ascendingOrderSorting(int[] arr) {

		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		return arr;
	}

	
	
	public static void main(String[] args) {
		int arr[]= {23,6,45,67,78,10};
		int ans[] = ascendingOrderSorting(arr);
		System.out.println(ans);//hascode od ans
		//for this print used enhanced for loop
		System.out.println("----------Ascending order after Sorting----------");
		for(int s:ans)
		{
			System.out.println(s);
		}
	}


}
