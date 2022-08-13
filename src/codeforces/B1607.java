package codeforces;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1607/problem/B"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 11:47:17 PM -  Aug 7, 2022
 */
public class B1607 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			long x = scanner.nextLong();
			long n = scanner.nextLong();
			long k;
			if (n % 4 == 1) {
				k = n;
			}else if (n % 4 == 2) {
				k = -1;
			}else if (n % 4 == 3) {
				k = -n - 1;
			}else {
				k = 0;
			}
			if (x % 2 == 0) {
				x -= k;
			}else {
				x += k;
			}
			System.out.println(x);
		}
		scanner.close();
	}
}
