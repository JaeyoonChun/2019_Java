package book;

public class Book {
	private int code;
	private String title;
	
	public Book(){}
	public Book(int code, String title) {
		this.code = code;
		this.title = title;
	}
	
	public int getCode() {return code;}
	public String getTitle() {return title;}
	
	public void print() {
		System.out.print("["+code+"] "+title+" ");
	}
	public void InputPrint() {
		System.out.print(title+" - code("+code+"), ");
	}

}
