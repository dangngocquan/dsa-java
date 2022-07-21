package codeforces;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/problemset/problem/439/A"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 11:24:31 PM -  May 4, 2022
 */
public class A439 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int d = scanner.nextInt();
		int totalTime = 0;
		for (int i = 0; i < n; i++) {
			totalTime += scanner.nextInt();
		}
		scanner.close();
		
		System.out.println((d >= totalTime + 10 * (n-1))? (d - totalTime) / 5 : -1);
	}
}
