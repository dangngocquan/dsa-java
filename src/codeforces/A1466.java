package codeforces;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * <a href = "https://codeforces.com/problemset/problem/1466/A"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 9:00:56 AM -  May 2, 2022
 */
public class A1466 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-->0) {
			int n = scanner.nextInt();
			int[] x = new int[n];
			for (int i = 0; i < n; i++) {
				x[i] = scanner.nextInt();
			}
			Set<Integer> set = new LinkedHashSet<>();
			for (int firstPoint = 0; firstPoint < n-1; firstPoint++) {
				for (int secondPoint = firstPoint + 1; secondPoint < n; secondPoint++) {
					set.add(x[secondPoint] - x[firstPoint]);
				}
			}
			System.out.println(set.size());
		}
		scanner.close();
	}
}
