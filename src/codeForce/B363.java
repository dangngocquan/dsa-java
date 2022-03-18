package codeForce;

import java.util.Scanner;

/**
 * 
 * This class is used to solve B363 problem in codeforce.
 * The link of this problem is <a href =  "https://codeforces.com/problemset/problem/363/B"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 2:53:42 PM -  Mar 18, 2022
 */
public class B363 {
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
		int k = scanner.nextInt();
		int[] h = new int[n+1];
		int minSum = Integer.MAX_VALUE;
		int sum = 0;
		int res = 0;
		for (int i = 1; i <= n; i++) {
			h[i] = scanner.nextInt();
			if (i<k) {
				sum += h[i];
			}else if (i==k) { 
				sum += h[i];
				if (sum<=minSum) {
					minSum = sum;
					res = i-k+1; 
				}
			}else if (i>k) {
				sum += h[i] - h[i-k];
				if (sum<=minSum) {
					minSum = sum;
					res = i-k+1;
				}
			}
		}
		scanner.close();
		//Output
		System.out.println(res);
	
	}
}
