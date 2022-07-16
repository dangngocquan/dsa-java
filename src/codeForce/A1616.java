package codeForce;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * <a href = "https://codeforces.com/contest/1616/problem/A"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 9:19:11 PM -  Jul 16, 2022
 */
public class A1616 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			Set<Integer> set = new LinkedHashSet<Integer>();
			for (int i = 0; i < n; i++) {
				int a = scanner.nextInt();
				if (set.contains(a)) {
					set.add(-a);
				}else {
					set.add(a);
				}
			}
			System.out.println(set.size());
		}
		scanner.close();
	}
}
