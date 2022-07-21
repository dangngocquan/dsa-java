package codeforces;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A1258 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/1358/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 3:34:03 PM -  Mar 18, 2022
 */
public class A1358 {
	/**
	 * 
	 * The main method - entry point of this app.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] res = new int[t];
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			if ((n*m)%2==0) {
				res[i] = (n*m)/2;
			}else {
				res[i] = n*(m/2) + n/2 + 1;
			}
		}
		scanner.close();
		//Output
		for (int i : res) System.out.println(i);
	}
}
