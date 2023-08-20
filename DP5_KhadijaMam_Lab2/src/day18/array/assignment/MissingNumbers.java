package day18.array.assignment;

public class MissingNumbers {
	public static void missingNumber(int arr[]) {
		int max = arr[0], min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}

			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Maximum Number :\t" + max);
		System.out.println("Minimum Number :\t" + min);

		System.out.println("\nMissing numbers from an array");
		for (int i = min; i <= max; i++) {
			boolean isMissing = true;
//					int flag=0;
			for (int j = 0; j < arr.length; j++) {
				if (i == arr[j]) {
					isMissing = false;
					// flag=1;

				}
			}
			if (isMissing == true) {
				System.out.println(i);
			}
//					if(flag==0)
//					{
//						System.out.println(i);
//					}

		}
	}

	public static void main(String[] args) {
		int arr[] = { 4, 8, 3, 5, 7, 2, 10, 50, 36, 32, 44, 48, 49, 22, 35 };
		missingNumber(arr);

	}
}
