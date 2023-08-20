package day18.array.assignment;

import java.util.Scanner;

/*7.	Write two methods that return the average of an array with following headers.
a.	public static int average(int[] array)
b.	public static double average(double[] array).
c.	Write main and invoke the 2 methods. 
*/
public class Program7 {

	public static int averageInt(int[] array) {

		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an elements for integer method");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
			sum += array[i];
		}
		int avg = (sum / array.length);
		return avg;
	}

	public static double averageDouble(double[] array) {
		double sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an elements double method");

		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextDouble();
			sum += array[i];
		}
		double avg = (sum / array.length);
		return avg;
	}

	public static void main(String[] args) {
		int size1, size2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an Array for int method");
		size1 = sc.nextInt();
		int arr[] = new int[size1];
		System.out.println("Integer Method");
		System.out.println("Average of Elements in Integer Method is :" + averageInt(arr));

		System.out.println("Enter the size of an Array for double method");
		size2 = sc.nextInt();
		double arr1[] = new double[size2];
		System.out.println("Double Method");
		System.out.println("Average of Elements in Double Method is :" + averageDouble(arr1));
		sc.close();
	}

}
