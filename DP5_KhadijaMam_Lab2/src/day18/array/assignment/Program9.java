package day18.array.assignment;
//9.	WAP to copy an array by iterating the array.
public class Program9 {
	
	    public static void copyOfAnArray() {
	        int[] originalArray = {1, 2, 3, 4, 5};
	        int[] copiedArray = new int[originalArray.length];

	        for (int i = 0; i < originalArray.length; i++) {
	            copiedArray[i] = originalArray[i];
	        }
	        
	        
	       
	        System.out.print("Source Array: ");
	        for (int i = 0; i < originalArray.length; i++) {
	            System.out.print(originalArray[i] + " ");
	        }
	        System.out.println();

	    
	        System.out.print("Copied Array: ");
	        for (int i = 0; i < copiedArray.length; i++) {
	            System.out.print(copiedArray[i] + " ");
	        }
	    }

	public static void main(String[] args) {
			
		copyOfAnArray();
	}
}
