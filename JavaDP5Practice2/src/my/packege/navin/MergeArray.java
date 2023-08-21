package my.packege.navin;

public class MergeArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {5, 6, 7, 8, 9, 10};
        int[] c = mergeArrays(a, b);

        // Print the elements of array c
        System.out.print("Output c[] = {");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
            if (i != c.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }

    public static int[] mergeArrays(int[] a, int[] b) {
        // Determine the length of the resulting array c
        int cLength = Math.min(a.length, b.length);

        // Initialize the array c
        int[] c = new int[cLength];

        // Iterate through both arrays a and b simultaneously and construct c
        for (int i = 0; i < cLength; i++) {
            if (i % 2 == 0) {
                c[i] = a[i];
            } else {
                c[i] = b[i];
            }
        }

        return c;
    }
}
