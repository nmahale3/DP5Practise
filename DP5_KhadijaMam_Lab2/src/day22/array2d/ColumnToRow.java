package day22.array2d;

public class ColumnToRow {

	public static void ColumnRow() {
		int arr[][]= {{2,7,1},{9,5,8}};
		
		for (int i = 0; i < arr.length+1; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[j][i]+" ");
			}
			System.out.println("\n--------------------");
		}
	}
	public static void main(String[] args) 
	{
		
		ColumnRow();
	}

}
