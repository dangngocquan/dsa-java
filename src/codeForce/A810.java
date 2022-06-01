package codeForce;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/problemset/problem/810/A"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 8:28:36 AM -  Jun 1, 2022
 */
public class A810 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += scanner.nextInt();
		}
		scanner.close();
		
		int marks = 2* (k*n - sum);
		if (marks < n) {
			marks = n;
		}
		
		System.out.println(marks - n);
	}
}
