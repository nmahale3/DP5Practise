package day18.array.mypractice;
// Element Swapping from index
public class FirstLastSwapping {
	
	public static void main(String[] args) {
		
		int a[]= {1,24,34,5,63,12};
		int size=a.length;
		int temp=a[2];
		a[2]=a[size-1];
		a[size-1]=temp;
		for (int i = 0; i < a.length; i++) {
			
			System.out.println(a[i]);
		}
	
	
	}

}
