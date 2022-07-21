package codeforces;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1611/problem/B"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 12:07:26 PM -  May 21, 2022
 */
public class B1611 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			long a = scanner.nextLong();
			long b = scanner.nextLong();
			if (a < b) {
				long temp = a;
				a = b;
				b = temp;
			}
			if (a >= 3*b) {
				System.out.println(b);
			}else {
				long x = (long)(Math.ceil((3*b - a)*1.0 / 4));
				long ans;
				if (2*x > b) {
					x = b/2;
					ans = x;
				}else {
					b -= 2*x;
					ans = x + b;
				}
				System.out.println(ans);
			}
			
		}
		scanner.close();
	}
}
