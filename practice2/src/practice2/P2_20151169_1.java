package practice2;
import java.util.Scanner;

public class P2_20151169_1 {
	static int fibonacci(int num) {
		if(num==1)
			return 1;
		else if (num==2)
			return 1;
		else if (num <= 0)
			return -1;
		else
			return fibonacci(num-2)+fibonacci(num-1);
	}
	
	public static void main(String args[]) {
		Scanner scin = new Scanner(System.in);
		System.out.print("Enter n : ");
		int n = scin.nextInt();
		int result = fibonacci(n);
		
		if (result == -1) System.out.println("Should enter a positive number");
		else System.out.printf("fibonacci(%d) = %d \n",n, result);
		
		scin.close();
	}

}
