package codeforces;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/problemset/problem/1354/A"> LInk </a>
 * @author Bris
 * @version 1.0
 * @since 1:38:17 PM -  May 3, 2022
 */
public class A1354 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-->0) {
			long a = scanner.nextLong();
			long b = scanner.nextLong();
			long c = scanner.nextLong();
			long d = scanner.nextLong();
			
			if (b >= a) {
				System.out.println(b);
				continue;
			}
			
			long totalTime = b;
			
			if (c <= d) {
				System.out.println(-1);
				continue;
			}
			
			totalTime += (long)Math.ceil((a - b) * 1.0 / (c-d)) * c;
			
			System.out.println(totalTime);
		}
		scanner.close();
	}
}
