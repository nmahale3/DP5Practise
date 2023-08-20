package com.assignment;

/*6. WAP to show unchecked exception*/
public class UncheckedException6 {

	public static void main(String[] args) {


		int rr[]= {1,2,3,4,5};


		try
		{
			for (int i = 0; i<= rr.length; i++)
			{
//				int div=20/0;
//				System.out.println(div);
				System.out.println(rr[i]);
			}

		}
		catch (ArrayIndexOutOfBoundsException|ArithmeticException e) {
			e.printStackTrace();
		}
	}
}
