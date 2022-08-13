package codeforces;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1709/problem/A"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 9:07:30 PM -  Aug 13, 2022
 */
public class A1709 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int x = scanner.nextInt();
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = scanner.nextInt();
			int count = 0;
			for (int i = 1; i <= 3; i++) {
				if (x == 1) {
					x = a;
					count++;
				}else if (x == 2) {
					x = b;
					count++;
				}else if (x == 3) {
					x = c;
					count++;
				}
			}
			if (count == 3) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
		scanner.close();
	}
}
