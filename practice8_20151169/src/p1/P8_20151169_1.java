package p1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class P8_20151169_1 {
	public static void main(String[] args) {
		ArrayList<Student> sList = new ArrayList<Student>();

		File file = new File("student.txt");
		Scanner scin;
		if (file.exists()) {
			try {
				scin = new Scanner(file);
				for (; scin.hasNext();) {
					String name = scin.next();
					ArrayList<String> subList = new ArrayList<String>();
					String sub = scin.next();
					subList.add(sub);
					sub = scin.next();
					subList.add(sub);
					sub = scin.next();
					subList.add(sub);
					sList.add(new Student(name, subList));
				}
				scin.close();
			} catch (IOException e) {
			}
		} else {
			System.out.println("student.txt not exist!!");
		}

		for (Student s : sList) {
			System.out.print(String.format("%10s", s.getName()));
			for(int i = 0; i < s.geteList().size(); i++) {
				System.out.print(String.format("%12s", s.geteList().get(i)));
			}
			System.out.println();
		}
	}
}
