package codeforces;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * <a href = "https://codeforces.com/contest/978/problem/A"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 9:16:37 PM -  Aug 13, 2022
 */
public class A978 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		Set<Integer> s = new LinkedHashSet<>();
		for (int i = n-1; i >= 0; i--) {
			s.add(a[i]);
		}
		System.out.println(s.size());
		String str = "";
		for (int element : s) {
			str = element + " " + str;
		}
		System.out.println(str);
		scanner.close();
	}
}
