package prototype;

public class Book {

	private int bookId;
	private String bName;
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bName=" + bName + "]";
	}

	
}
