package codeForce;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1092/problem/B"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 11:18:21 PM -  May 15, 2022
 */
public class B1092 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		scanner.close();
		
		int ans = 0;
		Arrays.sort(a);
		for (int i = 0; i < n; i += 2) {
			ans += a[i+1] - a[i];
		}
		System.out.println(ans);
	}
}
