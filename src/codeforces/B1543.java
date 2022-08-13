package codeforces;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1543/problem/B"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 10:53:39 PM -  Aug 7, 2022
 */
public class B1543 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			long n = scanner.nextInt();
			long total = 0;
			for (long i = 0; i < n; i++) {
				total += scanner.nextLong();
			}
			long k = total % n;
			long ans = (n-k) * k;
			System.out.println(ans);
		}
		scanner.close();
	}
}
