package codeForce;

import java.util.Scanner;

/**
 * 
 * This class is used to solve B339 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/339/B"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 10:53:10 PM -  Mar 17, 2022
 */
public class B339 {
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
		int m = scanner.nextInt();
		int[] a = new int[m+1];
		for (int i = 1; i <= m; i++  ) {
			a[i] = scanner.nextInt();
		}
		scanner.close();
		//Solve
		long res = 0;
		int location = 1;
		for (int i = 1; i <= m; i++) {
			if (a[i] >= location) {
				res += a[i] - location;
			}else {
				res += n - location + a[i];
			}
			location = a[i];
		}
		//Output
		System.out.println(res);
	}
}
