package day23.array2D;

public class ArrayDemo1 {

	public static void main(String[] args) {
		//3*3 matrices declaration
		//		int mat[][];
		//		mat=new int [3][3];


		//2*2 Declaration
		int arr[][]=new int [2][2];

		//		int row=4,col=3;
		//		int ar[][]=new int[row][col];

		//Accessing 2D Array

		System.out.println("-------------------------Element in 2D array before insertion-------------------------");
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[1][0]);
		System.out.println(arr[1][1]);

		// value declaration
		arr[0][0]=43;
		arr[0][1]=35;
		arr[1][0]=39;
		arr[1][1]=40;

		System.out.println("-------------------------Element in 2D array after insertion-------------------------");
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[1][0]);
		System.out.println(arr[1][1]);

		System.out.println("-------------------------Element in 2D array by for loop insertion-------------------------");
		for (int i = 0; i <2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println("Element at arr["+i+"]["+j+"]="+arr[i][j]+" ");
			}	
			System.out.println();
		}

		System.out.println("-------------------------Element in 2D array by for loop Matrices form-------------------------");
		for (int i = 0; i <2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(arr[i][j]+" ");
			}	
			System.out.println();
		}
	}

}
