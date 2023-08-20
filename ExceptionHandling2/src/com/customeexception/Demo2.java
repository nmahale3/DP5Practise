package com.customeexception;

import java.util.Scanner;
class BookNotFoundException1 extends Exception
{

	public BookNotFoundException1(String message) {
		super(message);
		
	}
	
}

class PurchaseBook1
{
	public static void checkBookId(int bookid) throws BookNotFoundException1 {
		if (bookid<101||bookid>501) {
			throw new BookNotFoundException1("Please check your bookid once ");
		} else {
			System.out.println("Your book found please pay at cash counter");
		}
	}
}
public class Demo2 {
	public static void main(String[] args)  {
		System.out.println("-----Welcome-----");
		System.out.println("Enter book Id from 101-501");
		Scanner s= new Scanner(System.in);
		int bookid=s.nextInt();
		try {
		PurchaseBook1.checkBookId(bookid);	
		} catch (BookNotFoundException1 e) {
		System.out.println(e);
//			System.out.println("Message : "+e.getMessage());
		}
		System.out.println("Thanks for shopping!!!!! visit again..... ");
		s.close();
	}
}
