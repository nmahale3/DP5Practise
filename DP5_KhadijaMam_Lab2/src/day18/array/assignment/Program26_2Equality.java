package day18.array.assignment;

import java.util.Arrays;

public class Program26_2Equality {

	public static void equality(int a1[], int a2[]) {
		if (a1.length == a2.length) 
		{
			System.out.println("Both Arrays are Equal");
			System.out.println(Arrays.toString(a1) + " = " + Arrays.toString(a2));
		} 
		else
		{
			System.out.println("Both Arrays aren't Equal");
		}
	}

	public static void main(String[] args) {
		int a1[] = { 12, 22, 32, 42, 52, 62 };
		int a2[] = { 52, 22, 62, 12, 42, 22 };
		equality(a1, a2);
	}
}
