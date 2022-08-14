package codeforces;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/716/problem/A"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 8:29:42 PM -  Aug 14, 2022
 */
public class A716 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int c = scanner.nextInt();
		int[] t = new int[n];
		for (int i = 0; i < n; i++) {
			t[i] = scanner.nextInt();
		}
		scanner.close();
		
		int ans = 1;
		for (int i = n-1; i >= 1; i--) {
			if (t[i] - t[i-1] <= c) {
				ans++;
			}else {
				break;
			}
		}
		System.out.println(ans);
	} 
}
