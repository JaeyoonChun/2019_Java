// 20151169 천재윤
package practice1;

import java.util.Scanner;

public class P1_20151169_1 {
	public static void main(String args[]) {
		Scanner scin = new Scanner(System.in);
		System.out.print("서로 다른 정수 두 개를 입력하시오 : ");
		int num1 = scin.nextInt();
		int num2 = scin.nextInt();
		
		int result=1;		
		if (num1 > num2) {
			System.out.println("큰 수 : "+num1);
			System.out.println("작은 수 : "+num2);
			for (int i=0;i<num2;i++) {
				result*=num1;
			}
		}			
		else {
			System.out.println("큰 수 : "+num2);
			System.out.println("작은 수 : "+num1);
			for (int i=0;i<num1;i++) {
				result*=num2;
			}
		}
		System.out.println("결과 : "+result);
		
		scin.close();	
	}
}
