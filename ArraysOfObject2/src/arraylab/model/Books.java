package arraylab.model;

public class Books {

	
	private int bookId;
	public int getBookId() {
		return bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public float getBookPrice() {
		return bookPrice;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public void setBookPrice(float bookPrice) {
		this.bookPrice = bookPrice;
	}
	private String bookName;
	private float bookPrice;
	 public Books()
	 {
		 
	 }
	public Books(int bookId, String bookName, float bookPrice) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}
	@Override
	public String toString() {
		return "Books [bookId=" + bookId + ", bookName=" + bookName + ", bookPrice=" + bookPrice + "]";
	}
	 
}
