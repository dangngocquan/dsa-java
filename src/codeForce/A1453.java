package codeForce;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * <a href = "https://codeforces.com/contest/1453/problem/A"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 1:17:10 PM -  Jul 16, 2022
 */
public class A1453 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			Set<Integer> set = new LinkedHashSet<>();
			for (int i = 0; i < n + m; i++) {
				set.add(scanner.nextInt());
			}
			System.out.println(n + m - set.size());
		}
		scanner.close();
	}
}
