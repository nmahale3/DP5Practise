package day20.Array3;

public class FrequencyOfNumber {


	public static void frequencyOfNumbers(int[] a) {
	
	
		for (int i = 0; i < a.length; i++) {
			int count=1;
			if(a[i]==-1)
			continue;
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j])
				{
					count++;
					a[j]=-1;
					
				}
			}
		System.out.println(a[i]+"\t is \t"+count+" times");
		}
				
		
	}
	
	public static void main(String[] args) {
		int a[]= {12,32,12,43,65,76,55,65,22,12,13,8,03};
		frequencyOfNumbers(a);
	}


}
