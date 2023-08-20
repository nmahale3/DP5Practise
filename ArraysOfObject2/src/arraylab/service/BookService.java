package arraylab.service;

import arraylab.dao.BooksDao;
import arraylab.model.Books;

public class BookService {
	static BooksDao booksdao =new BooksDao();
	public  void addBookService(Books books) {
		booksdao.addBook(books);
	}
	public void modifyBooknameService(Books books) {
		booksdao.modifyBookName(books.getBookId(),books.getBookName());
	}
	public void modifyBookPriceService(Books books) {
		booksdao.modifyBookPrice(books.getBookId(), books.getBookPrice());
	}
	public Books[] getAllBooksService() {
		return booksdao.getAllBooks();
	}
}