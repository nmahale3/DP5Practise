package day18.array.assignment;
import java.util.Scanner;

public class Program6 {

	
	public static void primeNumber(int a[]) {

		int i, j, len = a.length;
		for (i = 0; i < len; i++) {
			boolean isPrime = true;
			for (j = 2; j < a[i]; j++) {
				if (a[i] % j == 0) {
					isPrime = false;
					break;
				}
			}

			if (isPrime == true) {
				System.out.println(a[i] + " ");
			}
		}

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter length of an element");
		int n = s.nextInt();

		// System.out.println("Length of an array is :"+num);
		int num[] = new int[n];

		System.out.println("Enter " + n + " Elements");
		for (int i = 0; i < n; i++) {
			num[i] = s.nextInt();
		}

	System.out.println("Prime numbers are");
		primeNumber(num);
		s.close();
	}

}
