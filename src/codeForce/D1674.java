package codeForce;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1674/problem/D" > Link </a>
 * @author Bris
 * @version 1.0
 * @since 10:25:53 AM -  May 3, 2022
 */
public class D1674 {
	public static boolean isSorted(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			if (arr[i-1] > arr[i]) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-->0) {
			int n = scanner.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = scanner.nextInt();
			}
			
			for (int i = n - 1; i >= 1; i -= 2) {
				if (a[i] < a[i-1]) {
					int temp = a[i];
					a[i] = a[i-1];
					a[i-1] = temp;
				}
			}
			
			System.out.println(isSorted(a)? "YES" : "NO");
		}
		scanner.close();
	}
}
