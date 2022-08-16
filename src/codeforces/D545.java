package codeforces;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/problemset/problem/545/D"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 6:43:07 PM -  Aug 16, 2022
 */
public class D545 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		long[] t = new long[n];
		for (int i = 0 ; i < n; i++) {
			t[i] = scanner.nextLong();
		} 
		Arrays.sort(t);
		long ans = 0;
		long temp = 0;
		for (int i = 0; i < n; i++) {
			if (temp <= t[i]) {
				ans++;
				temp += t[i];
			}
		}
		System.out.println(ans);
		scanner.close();
	}
}
