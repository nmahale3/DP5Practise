package com.tq.day13.overriding;

/*1) WAP to create a class Kid with method readBook() and another method readBook () with 2parameters.
 * The method readBook here is over-loaded (same method name but different parameters)
 * Create a class BigKid which extends Kid created above.
 * Implement readBook() differently in BigKid class.
 * Here the method readBook() has been over-ridden in the child class BigKid()
 */
class Kid
{
	String booksType;
	String bookName;
	int bookPages;
	double bookPrice;
	public void readBook()
	{
		System.out.println("Kids reading Comics");
	}
	public void readBooks(String booksType,	String bookName,int bookPages,double bookPrice)
	{
		this.booksType=booksType;
		this.bookName=bookName;
		this.bookPrice=bookPrice;
		this.bookPages=bookPages;
	}
}

class BigKid extends Kid
{
	@Override
	public void readBook()
	{
		System.out.println("BigKids reading Personalities");
	}
	
	@Override
	public void readBooks(String booksType,	String bookName,int bookPages,double bookPrice)
	{
		this.booksType=booksType;
		this.bookName=bookName;
		this.bookPages=bookPages;
		this.bookPrice=bookPrice;
	}
}
public class Kidsss
{
	public static void main(String[] args) {
		
		Kid k1=new Kid();
		k1.readBook();
		k1.readBooks("Cartoon", "Mogli", 25, 100);
		System.out.println("Book Type : "+k1.booksType+" Book Name : "+k1.bookName+" Book Pages : "+k1.bookPages+" Book Price : "+k1.bookPrice);
		
		BigKid bk1=new BigKid();
		bk1.readBook();
		bk1.readBooks("Novel", "Chhava", 456, 820);
		System.out.println("Book Type : "+bk1.booksType+" Book Name : "+bk1.bookName+" Book Pages : "+bk1.bookPages+" Book Price : "+bk1.bookPrice);
	
		Kid k3=new BigKid();
		k3.readBook();
	}
}
