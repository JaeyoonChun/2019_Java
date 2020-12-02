package personext;
import person.Person;

public class Student extends Person {
	private int code;
	
	public Student() {}
	public Student(int no, String name, int code) {
		super(no, name);
		this.code = code;
	}
	
	public int getCode() {return code;}
	
	public void borrowedPrint(String title) {
		System.out.print(title+" is borrowed by student ");
		super.borrowedPrint(title);
	}

}
