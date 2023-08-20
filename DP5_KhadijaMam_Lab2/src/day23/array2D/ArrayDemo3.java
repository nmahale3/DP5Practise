package day23.array2D;

import java.util.Scanner;

public class ArrayDemo3 {

	public static void main(String[] args) {
		int tab[][]=new int [3][3];
		int i,j,rows,col;
		Scanner s = new Scanner(System.in);
		
		System.out.println("------Enter no . of rows-----");
		rows=s.nextInt();
	
		System.out.println("------Enter no . of columns-----");
		col=s.nextInt();
		
		for ( i = 0; i < rows; i++) {
			for ( j = 0; j < col; j++) {
				System.out.println("Enter Element for tab["+i+"]["+j+"]");
				tab[i][j]=s.nextInt();
			}
			System.out.println();
		}
		System.out.println("After inserting elements from user");
		for ( i = 0; i < rows; i++) {
			for ( j = 0; j < col; j++) {
			System.out.print(tab[i][j]+"\t");	
			}
		System.out.println("");
		}
	}
}
