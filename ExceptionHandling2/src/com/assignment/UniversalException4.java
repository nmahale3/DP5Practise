package com.assignment;

//4. WAP to show checked exception and use multiple catch block
//with universal Exception handler.

/*The classes that directly inherit the Throwable class
 * except RuntimeException and Error are known as checked exceptions.
 * For example, IOException, SQLException, etc.
 * Checked exceptions are checked at compile-time.*/
public class UniversalException4 {


	public static void main(String[] args) {
		try{    
			int a[]=new int[5];    
			a[5]=30;    
		}    
		catch(ArithmeticException e)  
		{  
			System.out.println("Arithmetic Exception occurs");  
		}    
		catch(ArrayIndexOutOfBoundsException e)  
		{  
			System.out.println("ArrayIndexOutOfBounds Exception occurs");  
		}    
		catch(Exception e)  
		{  
			System.out.println("Parent Exception occurs");  
		}             
		System.out.println("rest of the code");    
	}  	
}


