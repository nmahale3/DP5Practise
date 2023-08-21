package my.packege.navin;

public class OneXtel_Series {
	
	public static void main(String[] args) {
		
	
	long num2=391l,num3=915l;
	long num1=9873210l;
	long fact1=1l,fact2=1l,fact3=1l;
	while(num1>0) {
		long rem=num1%10;
		fact1=fact1*rem;		
		num1/=10;
	}
	System.out.println(fact1);

	while(num2>0) {
		long rem=num2%10;
		fact2=fact2*rem;
		num2/=10;
	}
	
	System.out.println(fact2);
	while(num3>0) {
		long rem=num3%10;
		fact3=fact3*rem;
		num3/=10;
	}
	System.out.println(fact3);
	
	long res=(fact1>fact2&&fact1>fact3)?fact1:(fact2>fact3)?fact2:fact3;
	System.out.println(res);
	}
}
