package codeForce;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * <a href ="https://codeforces.com/contest/1466/problem/B"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 10:37:43 PM -  Jun 7, 2022
 */
public class B1466 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			Set<Integer> set = new LinkedHashSet<>();
			for (int i = 0; i < n; i++) {
				int x = scanner.nextInt();
				if (set.contains(x)) {
					set.add(x+1);
				}else {
					set.add(x);
				}
			}
			System.out.println(set.size());
		}
		scanner.close();
	}
}
