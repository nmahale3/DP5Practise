package com.assignment;

/*Accept string from user ,
	if number of characters on the
	string is less than 10 raise 
	Runtime Exception otherwise print
	string
 */
import java.util.Scanner;
import java.lang.RuntimeException;

public class ExceptionDemo {
	public static void checkingLength(String s) {
		if (s.length() < 10) {
			throw new RuntimeException("String length is less than 10");

		} else {
			System.out.println(s);
		}
	}
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the String");
			String s = sc.nextLine();
			checkingLength(s);
			sc.close();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
	}

}
