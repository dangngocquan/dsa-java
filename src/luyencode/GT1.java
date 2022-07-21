package luyencode;

import java.util.Scanner;

public class GT1 {
	static int factorial(int n) {
		if (n==0) return 1;
		return factorial(n-1)*n;
	}
	
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		//Output
		System.out.println(factorial(n));
	}
}
