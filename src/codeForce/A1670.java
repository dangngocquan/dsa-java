package codeForce;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1670/problem/0"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 9:35:23 PM -  May 6, 2022
 */
public class A1670 {
	public static boolean isSorted(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i+1]) {
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
			int countNegativeNum = 0;
			for (int i = 0; i < n; i++) {
				a[i] = scanner.nextInt();
				if (a[i] < 0) {
					countNegativeNum++;
				}
			}
			for (int i = 0; i < n; i++) {
				if (i < countNegativeNum) {
					if (a[i] > 0) {
						a[i] = -a[i];
					}
				}else {
					if (a[i] < 0) {
						a[i] = -a[i];
					}
				}
			}
			System.out.println(isSorted(a)? "YES" : "NO");
		}
		scanner.close();
	}
}
