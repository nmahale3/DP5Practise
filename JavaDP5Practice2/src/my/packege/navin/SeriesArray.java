package my.packege.navin;

public class SeriesArray {

	public static void main(String[] args) {

			int number1[]= {1,2,3,4};

			int number2[]= {5,6,7,8,9,10};
//		int number1[]= {4,5,6,7};
//		int number2[]= {8,9,10,11,12,13};
		int number3[]=new int[number1.length+number2.length];
		for(int i=0;i<number2.length;i++) {
			if(i%2==0 & i<number1.length) {
				number3[i]=number1[i];
			}
			else {
				number3[i]=number2[i];
			}
		}
		for(int j:number3) {
			if(j!=0)
				System.out.print(j+" ");
		}
		System.out.println("\n========================vice versa of last arrays============================");
			int number4[]= {8,9,10,11,12,13};
		int number5[]= {4,5,6,7};
		int number6[]=new int[number4.length+number5.length];
		for(int i=0;i<number4.length  ;i++) {
			if(i%2==0 & i<number4.length) {
				number6[i]=number4[i];
			}
			else {
				number6[i]=number5[i];
			}
		}
		for(int j:number6) {
			if(j!=0)
				System.out.print(j+" ");
		}
		
	}
}