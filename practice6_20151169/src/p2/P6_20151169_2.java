package p2;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class P6_20151169_2 {
	static boolean find(String s) {
		String temp1, temp2;
		for (int i = 1; i <= (s.length() / 2); i++) {
			for (int j = i; j <= s.length() - i  ; j ++) {
				temp1 = s.substring(j-i, j);
				temp2 = s.substring(j, j+i);
				if (temp1.equals(temp2)) return false;
			}	
		}
		return true;
	}
	public static void main(String[] args) {
		File file = new File("password.txt");
		Scanner scin;
		if (file.exists()) { 
			try { 
				scin = new Scanner(file);
				int len = scin.nextInt();
				String[] pw = new String[len];
				for(int i = 0; scin.hasNext(); i++) {
					String password = scin.next();
					pw[i] = password;
				}
				for(String st: pw) {
					if (find(st)) System.out.println(st + " : accept");
					else System.out.println(st + " : reject");
				}
				scin.close(); 
			} 
			catch (IOException e) {}
		}
		else {
			System.out.println("password.txt not exist!!");
		}
	}
}
