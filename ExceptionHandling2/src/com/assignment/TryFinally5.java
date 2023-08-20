package com.assignment;

/*5. WAP where only try and finally is used*/
public class TryFinally5 {

	
	public static void main(String[] args) {
		
		try {
			int a= 10;
			int b=0;
			int div=a/b;
			System.out.println(div);
		}
		finally
		{
			System.out.println("Cant divide by zero");
		}
	}
	
}
