package arraylab.dao;

import java.util.Arrays;

import arraylab.model.Books;

public class BooksDao extends Books {
	public static Books bookType[] = new Books[5];
	static int bookIndex = 0;

	public BooksDao() {

	}

	public void addBook(Books book) {

		bookType[bookIndex++] = book;

	}

	public boolean modifyBookName(int bookId, String bookName) {
		for (int i = 0; i < bookIndex; i++) {
			if (bookType[i].getBookId() == bookId) {
				bookType[i].setBookName(bookName);
				return true;
			}
		}

		return false;
	}

	public boolean modifyBookPrice(int bookId, float bookPrice) {
		for (int i = 0; i < bookIndex; i++) {
			if (bookType[i].getBookId() == bookId) {
				bookType[i].setBookPrice(bookPrice);
				return true;
			}
		}

		return false;
	}
	
	public Books[] getAllBooks()
	{
		
		return bookType;
	}


}
