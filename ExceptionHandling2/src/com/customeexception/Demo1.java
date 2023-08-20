package com.customeexception;

import java.util.Scanner;
class BookNotFoundException extends RuntimeException
{

	public BookNotFoundException(String message) {
		super(message);
		
	}
	
}

class PurchaseBook
{
	public static void CheckBookId(int bookid) {
		if (bookid<101||bookid>501) {
			throw new BookNotFoundException("Please check your bookid once ");
		} else {
			System.out.println("Your book found please pay at cash counter");
		}
	}
}
public class Demo1 {
	public static void main(String[] args) {
		System.out.println("-----Welcome-----");
		System.out.println("Enter book Id from 101-501");
		Scanner s= new Scanner(System.in);
		int bookid=s.nextInt();
		try {
		PurchaseBook.CheckBookId(bookid);	
		} catch (BookNotFoundException e) {
//		System.out.println(e);
			System.out.println("Message : "+e.getMessage());
		}
		System.out.println("Thanks for shopping!!!!! visit again..... ");
		s.close();
	}
}
