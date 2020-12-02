package personext;
import person.Person;

public class Professor extends Person{
	private int code1;
	private int code2;
	
	public Professor() {}
	public Professor(int no, String name, int code1, int code2) {
		super(no, name);
		this.code1 = code1;
		this.code2 = code2;
	}
	
	public int getCode1() {return code1;}
	public int getCode2() {return code2;}
	
	public void borrowedPrint(String title) {
		System.out.print(title+" is borrowed by professor ");
		super.borrowedPrint(title);
	}
}
