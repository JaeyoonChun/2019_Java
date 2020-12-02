package p1;
import person.Person;
import personext.*;
import book.Book;
import bookext.*;
import java.util.Scanner;

public class P1_20151169_1 {
	private static void printBookList(Book[] B) {
		for(Book b : B) {
			b.print();
		}
	}
	
	private static void checkBook(Book[] B, Person[] P, String title) {
		boolean exist = false;
		boolean borrowed = false;

		for(Book b : B) {
			if((b.getTitle().equals(title))) {
				b.InputPrint();
				for(Person p : P) {
					if(isBorrowed(p, b.getCode())) {
						p.borrowedPrint(title);
						borrowed = true;
					}
				}
				if(!borrowed) System.out.println("*** No one borrowed '"+b.getTitle()+"' ***");
				exist = true;
			}
		}
		if(!exist) System.out.println("*** There is no book - '"+title+"' ***");
	}
	
	private static boolean isBorrowed(Person p, int code) {
		if (p instanceof Professor) {
			Professor pf = (Professor) p;
			if(pf.getCode1() == code) {
				return true;
			}
			else if(pf.getCode2() == code) {
				return true;
			}
		} else if (p instanceof Student) {
			Student std = (Student) p;
			if(std.getCode() == code) {
				return true;
			}
		}
		return false;
	}
	
	/***
	 * Stock 값을 감소시켜야 할 때의 코드
	static void printBookList(Book[] B, Person[] P) {
		for(Book b : B) {
			if (b instanceof ComputerBook) {
				for (Person p : P) {
					if(isBorrowed(p, b.getCode())) {
						ComputerBook cb = (ComputerBook) b;
						cb.setStock(cb.getStock() - 1);
					}
				}
			}
			b.print();
		}
	}

	static void checkBook(Book[] B, Person[] P, String title) {
		boolean exist = false;
		boolean borrowed = false;

		for(Book b : B) {

			if((b.getTitle().equals(title))) {

				b.InputPrint();

				for(Person p : P) {

					if(isBorrowed(p, b.getCode())) {
						p.borrowedPrint(title);
						borrowed = true;
					}
				}

				if(!borrowed) System.out.println("*** No one borrowed '"+b.getTitle()+"' ***");
				exist = true;
			}
		}

		if(!exist) System.out.println("*** There is no book - '"+title+"' ***");
	}
	
	static boolean isBorrowed(Person p, int code) {
		if (p instanceof Professor) {
			Professor pf = (Professor) p;
			if(pf.getCode1() == code) {
				return true;
			}
			else if(pf.getCode2() == code) {
				return true;
			}
		} else if (p instanceof Student) {
			Student std = (Student) p;
			if(std.getCode() == code) {
				return true;
			}
		}
		return false;
	}***/

	public static void main(String[] args) {
		Person[] P = new Person[5];
		P[0] = new Student(20191234, "Hong Gil Dong", 4);
		P[1] = new Student(20181111, "Lee Gil Dong", 7);
		P[2] = new Professor(123456, "Lee Chul Soo", 1, 5);
		P[3] = new Professor(111111, "Kim Young Hee", 6, 2);
		P[4] = new Student(20191000, "Park Chul Soo", 5);

		Book[] B = new Book[7];
		B[0] = new ComputerBook(1, "Algorithms", 2);
		B[1] = new ComputerBook(2, "Networks", 4);
		B[2] = new EnglishBook(3, "Nudge", 2009);
		B[3] = new EnglishBook(4, "Black Swan", 2005);
		B[4] = new EnglishBook(5, "Snoopy", 2000);
		B[5] = new ComputerBook(6, "Cryptography", 3);
		B[6] = new EnglishBook(7, "Peter Pan", 1990);

		//printBookList(B, P);							#stock 값을 감소시켜야 할 때
		printBookList(B);
		System.out.println();

		Scanner scin = new Scanner(System.in);
		System.out.print("Enter book title : ");
		String title = scin.nextLine();

		checkBook(B, P, title);

		scin.close();
	}
}