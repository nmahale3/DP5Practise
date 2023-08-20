package day18.array.assignment;

//15.	WAP to find the second smallest element in an array.
public class Program15 {
	public static int findSecondSmallest(int[] arr) {
		if (arr.length < 2) {
			throw new IllegalArgumentException("Array size should be at least 2.");
		}

		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;

		// Find the smallest and second smallest elements
		for (int num : arr) {
			if (num < smallest) {
				secondSmallest = smallest;
				smallest = num;
			} else if (num < secondSmallest && num != smallest) {
				secondSmallest = num;
			}
		}

		return secondSmallest;
	}

	public static void main(String[] args) {
		int[] array = { 7, 2, 1, 4, 5, 3, 6 };

		int secondSmallest = findSecondSmallest(array);

		System.out.println("The second smallest element in the array is: " + secondSmallest);
	}
}
