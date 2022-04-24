package codeForce;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/problemset/problem/1373/A"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 4:25:37 PM -  Apr 24, 2022
 */
public class A1373 {
	/**
	 * The main method.
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-->0) {
			long a = scanner.nextLong();
			long b = scanner.nextLong();
			long c = scanner.nextLong();
			long k1, x1;
			//x1 = k1*b + 1
			// k1*(b*a - c) < c- a
			if (b*a-c == 0) {
				k1 = 0;
				x1 = k1*b + 1;
			}else if (b*a - c > 0) {
				if (c > a) {
					x1 = 1;
				}else {
					x1 = -1;
				}
			}else {
				x1 = 1;
			}
			
			long k2, x2;
			//x2 = k2*b
			// k2*a*b > k2*c
			if (b*a-c == 0) {
				x2 = -1;
			}else if (b*a - c > 0) {
				k2 = 1;
				x2 =  k2*b;
			}else {
				x2 = -1;
			}
			System.out.println(x1 + " " + x2);
		}
		scanner.close();
	}
}
