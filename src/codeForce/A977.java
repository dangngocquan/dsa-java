package codeForce;

import java.util.Scanner;

public class A977 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		scanner.close();
		//Solve
		for (int i = 1; i <= k; i++) {
			if (n%10 !=0) {
				n -=1;
			}else {
				n /= 10;
			}
		}
		//Output
		System.out.println(n);
	}
}
