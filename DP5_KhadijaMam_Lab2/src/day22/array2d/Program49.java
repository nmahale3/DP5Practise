package day22.array2d;
import java.util.Arrays;
public class Program49 {
	public static boolean areArraysEqual(int[] arr1, int[] arr2) {
		// Check for null arrays
		if (arr1 == null || arr2 == null) {
			return arr1 == arr2;
		}

		// Check array lengths
		if (arr1.length != arr2.length) {
			return false;
		}

		// Sort both arrays
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		// Compare arrays
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) {
				return false;
			}
		}

		
		return true;// If no differences were found, the arrays are equal
	}

	public static void main(String[] args) {
		int[] arr1 = {12, 22, 32, 42, 52, 62};
		int[] arr2 = {52, 22, 62, 12, 42, 32};

		if (areArraysEqual(arr1, arr2)) {
			System.out.println("The arrays are equal.");
		} else {
			System.out.println("The arrays are not equal.");
		}
	}
}


