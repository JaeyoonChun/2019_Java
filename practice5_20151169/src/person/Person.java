package person;

public class Person {
	private int no;
	private String name;
	
	public Person() {}
	public Person(int no, String name) {
		this.no = no;
		this.name = name;
	}
	
	public void borrowedPrint(String title) {
		System.out.println(name+"("+no+")");
	}
}
