package p1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class P7_20151169_1 {
	public static void main(String[] args) {
		System.out.println("1부터 100사이의 하나의 정수를 선택했습니다.\n맞춰 보세요^^");
		System.out.println("------------------------------");
		
		Scanner scin = new Scanner(System.in);
		int answer = (int)(Math.random()*100 + 1);
		int count = 0;
		int input;
		while(true) {
			System.out.print("1과 100사이의 값을 입력하세요 : ");
			count++;
			try {
				input = scin.nextInt();
				if (input > answer) System.out.println("더 작은 수를 입력하세요.");
				else if(input < answer) System.out.println("더 큰 수를 입력하세요.");
				else {
					System.out.println("맞췄습니다.");
					break;
				}
			}
			catch(InputMismatchException e){
				System.out.println("***** 유효하지 않은 입력입니다. 다시 시작하세요. *****\n");
				scin = new Scanner(System.in);
			}
			
 		}
		System.out.println("시도횟수는 "+count+"번입니다.");	
		scin.close();
	}
}
