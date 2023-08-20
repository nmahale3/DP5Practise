package day23.array2D;

public class ArrayTranspose {

	public static void main(String[] args) {
		int mat[][]= {{11,22,33},{44,55,66},{77,88,99}};
		int i,j, transpose[][]=new int[3][3];
	System.out.println("------------Original matrics------------");
		for ( i = 0; i <3; i++) {
			for ( j = 0; j < 3; j++) {
				System.out.print(mat[i][j]+"\t");
			}
			System.out.println();
		}
		for ( i = 0; i <3; i++) {
			for ( j = 0; j < 3; j++) {
				transpose[j][i]=mat[i][j];
			}
		}
		
		System.out.println("\n------------Transpose matrics------------");
		for ( i = 0; i <3; i++) {
			for ( j = 0; j < 3; j++) {
				System.out.print(transpose[i][j]+"\t");
			}
			System.out.println();
		}	
	}
}
