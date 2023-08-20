package day18.array.assignment;

public class FindCommonElements25 {

    public static void main(String[] args) {
        int[] arr1 = {12, 23, 34, 67, 78, 91, 56};
        int[] arr2 = {39, 25, 15, 23, 55, 91, 66, 22};
        int i, j;
        boolean found;

        // Initialize a boolean array to indicate whether an element has been found in the second array.
        boolean[] foundInSecondArray = new boolean[arr1.length];

        for (i = 0; i < arr1.length; i++) {
            found = false;
            for (j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    found = true;
                    foundInSecondArray[i] = true;
                    break;
                }
            }
        }

        // Print out the common elements.
        for (i = 0; i < arr1.length; i++) {
            if (foundInSecondArray[i]) {
                System.out.println(arr1[i]);
            }
        }
    }
}

