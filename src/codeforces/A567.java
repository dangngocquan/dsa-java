package codeforces;

import java.util.Scanner;

/**
 * 
 * This program is used to solve A567 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/567/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 12:18:55 PM -  Mar 21, 2022
 */
public class A567 {
	/**
	 * 
	 * The main method - entry point of this program.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		scanner.close();
		
		for (int i = 0; i < n; i++) {
			int min;
			int max;
			if (i == 0) {
				min = Math.abs(a[i] - a[i+1]);
				max = Math.abs(a[i] - a[n-1]);
			}else if (i== n -1) {
				min = Math.abs(a[i] - a[i-1]);
				max = Math.abs(a[0] - a[i]);
			}else {
				min = Math.min(Math.abs(a[i] - a[i+1]), Math.abs(a[i] - a[i-1]));
				max = Math.max(Math.abs(a[i] - a[0]), Math.abs(a[i] - a[n-1]));
			}
			System.out.println(min + " " + max);
		}
	}
}
