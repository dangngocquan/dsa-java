package codeforces;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * This class is used to solve B230 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/230/B"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 10:57:58 PM -  Mar 17, 2022
 */
public class B230 {
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
		long[] x = new long[n];
		for (int i = 0; i < n; i++) {
			x[i] = scanner.nextLong();
		}
		scanner.close();
		//Solve
		boolean[] isPrime = new boolean[1000001];
		Arrays.fill(isPrime, true);
		for (int i = 2; i <= 1000; i++) {
			if (isPrime[i]) {
				for (int j = 2*i; j < 1000001; j += i) {
					isPrime[j] = false;
				}
			}
		}
		//Output
		for (long i: x) {
			long y = (long)(Math.sqrt(i));
			if (i == Math.pow(y,2) && isPrime[(int)y] && i > 3) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}
}
