package codeForce;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A580 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/580/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 6:18:22 PM -  Mar 17, 2022
 */
public class A580 {
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
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		scanner.close();
		//Solve
		//res - the length of the maximum non-decreasing subsegment of sequence a.
		int res = 1;
		
		//tempLength - a temporary value, store the length.
		int tempLength = 1;
		for (int i = 1; i < n; i++) {
			if (a[i]>= a[i-1]) {
				tempLength++;
				if (tempLength> res) res = tempLength;
			}else {
				if (tempLength>res) res = tempLength;
				tempLength = 1;
			}
		}
		//Output
		System.out.println(res);
	}
}
