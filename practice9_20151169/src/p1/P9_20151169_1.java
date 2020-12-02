// 20151169 천재윤
package p1;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

class Ban{
	private int ban;
	private LinkedList<Student> list;
	Ban(){}
	Ban(int ban, Student std){
		this.ban = ban;
		this.list = new LinkedList<Student>();
		this.list.add(std);
	}
	
	int getBan() {
		return this.ban;
	}
	
	LinkedList<Student> getList() {
		return this.list;
	}
	void setList(int i, Student newStd) {
		this.list.add(i, newStd);
	}
}

class Student{
	private int no;
	private String name;
	Student(){}
	Student(int no, String name){
		this.no = no;
		this.name = name;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

public class P9_20151169_1 {
	static void printList(LinkedList<Ban> lst) {
		for(Ban b: lst) {
			System.out.println("<"+b.getBan()+"반>");
			for(Student s:b.getList()) {
				System.out.print(s.getNo()+"번 ");
				System.out.println(s.getName());
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		LinkedList<Ban> BL = new LinkedList<Ban>();
		
		File file = new File("student.txt");
		
		Scanner scin;
		if (file.exists()) {
			try {
				scin = new Scanner(file);
				for (; scin.hasNext();) {
					String name = scin.next();
					int ban = scin.nextInt();
					int no = scin.nextInt();
					
					if(BL.size() == 0) {
						BL.add(new Ban(ban, new Student(no, name)));
					}
					else {
						int idx = 0;
						do {
							if(BL.get(idx).getBan() == ban) {
								int stdIdx = 0;
								do {
									if(BL.get(idx).getList().get(stdIdx).getNo() > no) {
										BL.get(idx).setList(stdIdx, new Student(no, name));
										break;
									}
									stdIdx++;
								}while(stdIdx < BL.get(idx).getList().size());
								if(stdIdx == BL.get(idx).getList().size()) {
									BL.get(idx).setList(stdIdx, new Student(no, name));
								}
								break;
							}
							else if (BL.get(idx).getBan() > ban) {
								BL.add(idx, new Ban(ban, new Student(no, name)));		
								break;
							}
							idx++;
						}while(idx < BL.size());
						if (idx == BL.size()) {
							BL.add(idx, new Ban(ban, new Student(no, name)));
						}
					}
				}
				scin.close();
			} catch (IOException e) {
			}
		} else {
			System.out.println("student.txt not exist!!");
		}
		
		printList(BL);
	}

}
