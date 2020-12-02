package p1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

class Student {
	// 반드시 5개의 private 속성을 갖는다. (no, name, clang, java, html5) // total, average, rank는 포함시켜도 되고 안 시켜도 괜찮다. // no, name, clang, java, html5는 파일로부터 채운다. // total, average, rank는 코딩에서 채워야 한다. 
	private int no;
	private String name;
	private int clang;
	private int java;
	private int html5;
	private int total;
	private float average;
	private int rank;

	Student(){}
	Student(int no, String name, int clang, int java, int html5){
		this.no = no;
		this.name = name;
		this.clang = clang;
		this.java = java;
		this.html5 = html5;
		this.rank = 0;
		this.total = 0;
		this.average = 0f;
	}

	public int getClang() {
		return clang;
	}
	public void setClang(int clang) {
		this.clang = clang;
	}
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public int getHtml5() {
		return html5;
	}
	public void setHtml5(int html5) {
		this.html5 = html5;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public float getAverage() {
		return average;
	}
	public void setAverage(float average) {
		this.average = average;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public String toString() {
		DecimalFormat df1 = new DecimalFormat("00");
		DecimalFormat df2 = new DecimalFormat("00.##");

		return "rank : "+df1.format(rank)+" ["+no+", "+name+", (total : "+total+", average : "+df2.format(average)+")]";
	}
}


public class P6_20151169_1 {
	static void sorting(Student[] st) {
		for (Student s : st) {
			s.setTotal(s.getClang() + s.getHtml5() + s.getJava());
			s.setAverage(s.getTotal() / 3.0f );
		}
		Student temp;
		for (int i = 0; i < st.length - 1; i++) {
			for (int j = i+1; j < st.length; j++) {
				if(st[i].getTotal() < st[j].getTotal()) {
					temp = st[j];
					st[j] = st[i];
					st[i] = temp;
					st[i].setRank(i+1);
				}
			}
		}
		st[9].setRank(10);
	}
	
	public static void main(String[] args) {
		Student st[] = new Student[10];

		// 파일에서 데이터를 읽어서 배열 채우기
		File file = new File("student.txt");
		Scanner scin;
		if (file.exists()) { 
			try { 
				scin = new Scanner(file);
				for (int i = 0; scin.hasNext(); i++) {
					int id = scin.nextInt();
					String name = scin.next();
					int clang = scin.nextInt();
					int java = scin.nextInt();
					int html5 = scin.nextInt();
					st[i] = new Student(id, name, clang, java, html5);
				}
				scin.close(); } 
			catch (IOException e) {}
		}
		else {
			System.out.println("student.txt not exist!!");
		}

		System.out.println("***** Before Ranking *****");
		for (Student s : st)
			System.out.println(s);

		sorting(st);

		System.out.println();
		System.out.println("***** After Ranking *****");
		for (Student s : st)
			System.out.println(s);

	}

}
