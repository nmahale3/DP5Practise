package day18.array.assignment;

public class Program13{
	    public static int countDuplicates(int[] arr) {
	        int count = 0;
	        
	        // Iterate over each element in the array
	        for (int i = 0; i < arr.length; i++) {
	            // Check if the element is already counted as a duplicate
	            boolean isDuplicate = false;
	            
	            // Compare the element with the rest of the array
	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[i] == arr[j]) {
	                    isDuplicate = true;
	                    break;
	                }
	            }
	            
	            // If the element is a duplicate, increment the count
	            if (isDuplicate) {
	                count++;
	            }
	        }
	        
	        return count;
	    }

	    public static void main(String[] args) {
	        int[] array = {1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 5, 9, 3};

	        int totalDuplicates = countDuplicates(array);

	        System.out.println("Total number of duplicate elements: " + totalDuplicates);
	    }
	}


