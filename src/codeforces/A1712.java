package codeforces;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * <a href = "https://codeforces.com/contest/1712/problem/A"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 11:49:54 PM -  Aug 13, 2022
 */
public class A1712 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			int k = scanner.nextInt();
			int[] p = new int[n];
			int[] p1 = new int[n];
			for (int i = 0; i < n; i++) {
				p[i] = scanner.nextInt();
				p1[i] = p[i];
			}
			int ans = 0;
			Arrays.sort(p1);
			int[] count = new int[101];
			int[] count1 = new int[101];
			Set<Integer> s = new LinkedHashSet<>();
			for (int i = 0; i < k; i++) {
				count[p[i]]++;
			}
			for (int i = 0; i < k; i++) {
				count1[p1[i]]++;
				s.add(p1[i]);
			}
			for (int element : s) {
				ans += count1[element] - count[element];
			}
			System.out.println(ans);
		}
		scanner.close();
	}
}
