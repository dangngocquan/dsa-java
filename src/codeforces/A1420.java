package codeforces;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1420/problem/A"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 11:23:13 AM -  Jul 14, 2022
 */
public class A1420 {
	public static boolean isDecreaseArray(int[] a) {
		for (int i = 0; i < a.length-1; i++) {
			if (a[i] <= a[i+1]) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = scanner.nextInt();
			}
			
			System.out.println((isDecreaseArray(a))? "NO" : "YES");
		}
		scanner.close();
	}
}
