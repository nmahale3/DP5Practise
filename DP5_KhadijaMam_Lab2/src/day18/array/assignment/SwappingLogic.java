
package day18.array.assignment;

import java.util.Arrays;

public class SwappingLogic {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] arr1 = {5, 6, 7, 8, 9, 10};
        int leng=arr.length+arr1.length;
        int[] arr2 = new int[leng];
        for (int i = 0; i < leng; i++) {
            arr2[i] = arr[i];
            arr2[i + arr.length] = arr1[i];
        }

        System.out.println(Arrays.toString(arr2));
    }
}
