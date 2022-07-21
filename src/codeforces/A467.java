package codeforces;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A467 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/467/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 5:18:43 PM -  Mar 17, 2022
 */
public class A467 {
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
		int[] p = new int[n];
		int[] q = new int[n];
		
		//res - the number of rooms where George and Alex can move in.
		int res = 0;
		
		for (int i = 0; i < n; i++) {
			p[i] = scanner.nextInt();
			q[i] = scanner.nextInt();
			if (q[i] - p[i] >= 2) res++;
		}
		scanner.close();
		//Output
		System.out.println(res);
	}
}
