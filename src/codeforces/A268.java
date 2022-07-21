package codeforces;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A268 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/268/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 6:49:27 PM -  Mar 17, 2022
 */
public class A268 {
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
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
			b[i] = scanner.nextInt();
		}
		scanner.close();
		//Solve
		//res - the number of games where the host team is going to play in the guest uniform.
		int res = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j != i && a[i] == b[j]) res++;
			}
		}
		//Output
		System.out.println(res);
 	}
}
