package codeForce;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/problemset/problem/1467/A"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 11:17:20 PM -  Apr 22, 2022
 */
public class A1467 {
	/**
	 * .
	 * @param args .
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-->0) {
			int n = scanner.nextInt();
			if (n == 1) {
				System.out.println(9);
				continue;
			}else if (n == 2) {
				System.out.println(98);
				continue;
			}
			System.out.print(98);
			int temp = 9;
			for (int i = 3; i <= n; i++) {
				System.out.print(temp);
				temp++;
				if (temp > 9) {
					temp = 0;
				}
			}
			System.out.println();
		}
		scanner.close();
	}
}
