package codeForce;

import java.util.Scanner;

public class B268 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		//Solve
		int ans = n;
		if (n > 1) {
			for (int i = 1; i < n; i++) {
				ans += i*(n-i);
			}
		}
		//Output
		System.out.println(ans);
	}
}
