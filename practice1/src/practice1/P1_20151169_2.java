// 20151169 √µ¿Á¿±
package practice1;

import java.util.Scanner;

public class P1_20151169_2 {
	public static void main(String args[]) {
		Scanner scin = new Scanner(System.in);
		System.out.print("Enter one integer : ");
		int input = scin.nextInt();
		
		int count = 0;
		System.out.println("");
		for (int i =1;i<=input;i++) {
			if (input%i==0) {
				if (i !=input) System.out.print(i+", ");
				else System.out.println(i);
				count++;
			}
		}
		System.out.println();
		System.out.print("count : "+count);
		
		scin.close();
	}
}
