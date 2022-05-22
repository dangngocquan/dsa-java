package codeForce;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1471/problem/A"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 11:59:15 AM -  May 21, 2022
 */
public class A1471 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			long x = scanner.nextInt();
			long min = 0;
			long max = 0;
			for (int i = 0; i < n; i++) {
				long num = scanner.nextLong();
				min += num;
				max += (long)(Math.ceil(num*1.0 / x));
			}
			min = (long)(Math.ceil(min * 1.0 / x));
			System.out.println(min + " " + max);
		}
		scanner.close();
	}
}
