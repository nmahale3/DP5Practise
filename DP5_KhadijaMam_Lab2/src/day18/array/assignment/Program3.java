package day18.array.assignment;

import java.util.Scanner;

public class Program3 {

	public static void oddEven() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length of an array");
		int n = s.nextInt();
		int a[] = new int[n];
		int len = a.length;
		for (int i = 0; i < len; i++) {
			System.out.println("Enter element");
			a[i] = s.nextInt();
		}

		System.out.println(":Even Elements:");

		for (int i : a) {

			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println("\n:Odd Elements:");
		for (int i : a) {

			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
		s.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		oddEven();
	}

}
