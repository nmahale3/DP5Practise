package day18.array.assignment;
//14.	WAP to print all unique elements in the array.
public class Program14 {

	public static void printUniqueElements(int[] arr) {
	
		for (int i = 0; i < arr.length; i++) {
			// Check if the element is already printed as a unique element
			boolean isUnique = true;

			// Compare the element with the rest of the array
			for (int j = 0; j < arr.length; j++) {
				if (i != j && arr[i] == arr[j]) {
					isUnique = false;
					break;
				}
			}

			// If the element is unique, print it
			if (isUnique) {
				System.out.print(arr[i] + " ");
			}
		}
	}

	public static void main(String[] args) {
		int[] array = { 11, 12, 11, 21, 2, 21, 61, 34, 77,33, 88, 51, 9, 31 };

		System.out.println("Unique elements in the array:");
		printUniqueElements(array);
	}
}
