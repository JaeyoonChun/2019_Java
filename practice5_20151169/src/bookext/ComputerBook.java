package bookext;
import book.Book;

public class ComputerBook extends Book{
	private int stock;
	
	public ComputerBook() {}
	public ComputerBook(int code, String title, int stock) {
		super(code, title);
		this.stock = stock;
	}
	/***
	 * stock 값을 감소시켜야 할 때
	public int getStock() {return stock;}
	public void setStock(int newStock) {this.stock = newStock;}
	*/
	
	public void print() {
		super.print();
		System.out.println("(stock : "+stock+")");
	}
	public void InputPrint() {
		super.InputPrint();
		System.out.println("stock - ("+stock+")");
	}
	
}
