package codeforces;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * This class is used to solve A160 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/160/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 5:11:17 PM -  Mar 17, 2022
 */
public class A160 {
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
		
		//sum - the sum of n integer a1, a2, ..., an
		int sum = 0;
		for (int i = 0; i<n; i++) {
			a[i] = scanner.nextInt();
			sum += a[i];
		}
		scanner.close();
		//Solve;
		
		//res - the minimum needed number of coins.
		int res = 0;
		
		//sum1 - a temporary value
		int sum1 = 0;
		Arrays.sort(a);
		for (int i = n-1; i >=0; i--) {
			sum1 += a[i];
			res++;
			if (sum1 > sum/2) break;
		}
		//Output
		System.out.println(res);
	}
}
