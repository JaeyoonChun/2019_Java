package bookext;
import book.Book;

public class EnglishBook extends Book {
	private int publishedYear;
	
	public EnglishBook() {}
	public EnglishBook(int code, String title, int publishedYear) {
		super(code, title);
		this.publishedYear = publishedYear;	
	}
		
	public void print() {
		super.print();
		System.out.println("(published : "+publishedYear+")");
	}
	public void InputPrint() {
		super.InputPrint();
		System.out.println("published year - ("+publishedYear+")");
	}
}
