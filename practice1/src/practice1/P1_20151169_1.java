// 20151169 õ����
package practice1;

import java.util.Scanner;

public class P1_20151169_1 {
	public static void main(String args[]) {
		Scanner scin = new Scanner(System.in);
		System.out.print("���� �ٸ� ���� �� ���� �Է��Ͻÿ� : ");
		int num1 = scin.nextInt();
		int num2 = scin.nextInt();
		
		int result=1;		
		if (num1 > num2) {
			System.out.println("ū �� : "+num1);
			System.out.println("���� �� : "+num2);
			for (int i=0;i<num2;i++) {
				result*=num1;
			}
		}			
		else {
			System.out.println("ū �� : "+num2);
			System.out.println("���� �� : "+num1);
			for (int i=0;i<num1;i++) {
				result*=num2;
			}
		}
		System.out.println("��� : "+result);
		
		scin.close();	
	}
}
