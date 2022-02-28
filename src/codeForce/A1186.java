package codeForce;

import java.util.Scanner;

public class A1186 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int k = scanner.nextInt();
		scanner.close();
		//Output
		if (m>=n && k>= n) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
