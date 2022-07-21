package codeforces;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * <a href = "https://codeforces.com/problemset/problem/1365/A"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 12:34:27 PM -  Apr 22, 2022
 */
public class A1365 {
	/**
	 * .
	 * @param args .
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-->0) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			Set<Integer> columns = new LinkedHashSet<>();
			Set<Integer> rows = new LinkedHashSet<>();
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if (scanner.nextInt() == 1) {
						columns.add(j);
						rows.add(i);
					}
				}
			}
			int ans = Math.min(n - rows.size(), m - columns.size());
			System.out.println((ans %2 == 1)? "Ashish" : "Vivek");
		}
		scanner.close();
	}
}
