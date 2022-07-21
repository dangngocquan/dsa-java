package codeforces;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/276/problem/A"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 6:20:30 PM -  May 21, 2022
 */
public class A276 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		long k = scanner.nextLong();
		long ans = Long.MIN_VALUE;
		while (n-- > 0) {
			long f = scanner.nextLong();
			long t = scanner.nextLong();
			ans = Math.max(ans, (t > k)? f - (t-k) : f);
		}
		System.out.println(ans);
		scanner.close();
	}
}
