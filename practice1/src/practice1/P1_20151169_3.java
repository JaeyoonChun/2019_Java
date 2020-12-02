// 20151169 √µ¿Á¿±
package practice1;

import java.util.Scanner;

public class P1_20151169_3 {
	public static void main(String args[]) {
		Scanner scin = new Scanner(System.in);
		System.out.print("Enter two integer : ");
		int num1 = scin.nextInt();
		int num2 = scin.nextInt();
		
		for(int i=1;i<=num1;i++) {
			for(int j=1;j<=num2;j++) {
				if(i==1 || i==num1) {
					System.out.print("*");
				}
				else {
					if(j==1 || j==num2) System.out.print("*");
					else System.out.print(" ");
				}
			}
			System.out.println();
		}
		scin.close();
	}
}
