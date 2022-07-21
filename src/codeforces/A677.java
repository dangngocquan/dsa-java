package codeforces;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A677 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/677/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 5:15:20 PM -  Mar 17, 2022
 */
public class A677 {
	/**
	 * 
	 * The main method - entry point of this app.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int h = scanner.nextInt();
		int[] a = new int[n];
		
		//count - the number of a[i] that a[i] > h
		int count = 0;
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
			if (a[i] > h) count++;
		}
		scanner.close();
		
		//res - the minimum possible valid width of the road.
		int res = n+ count;
		//Output
		System.out.println(res);
	}
}
