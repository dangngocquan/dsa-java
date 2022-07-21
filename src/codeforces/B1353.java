package codeforces;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * This class is used to solve B1353 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/1353/B"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 1:17:24 PM -  Mar 18, 2022
 */
public class B1353 {
	/**
	 * 
	 * This method is used to get the maximum possible sum you can obtain in the array a if you can do no more than.
	 * 
	 * @param n is the number of elements in a and b.
	 * @param k is the maximum number of moves you can do.
	 * @param a is the integer array a.
	 * @param b is the integer array b.
	 * @return Return a Integer data type - the maximum possible sum you can obtain in the array a if you can do no more than.
	 */
	public static int getResult(int n, int k, int[] a, int[] b) {
		int res = 0;
		Arrays.sort(a);
		Arrays.sort(b);
		for (int i = 0; i < n; i++) {
			if (i<k) {
				if (a[i] < b[n-1-i]) {
					res += b[n-1-i];
				}else {
					res += a[i];
				}
			}else {
				res += a[i];
			}
		}
		return res;
	}
	
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
			int k = scanner.nextInt();
			int[] a = new int[n];
			int[] b = new int[n];
			for (int j = 0; j < n; j++) {
				a[j] = scanner.nextInt();
			}
			for (int j = 0; j < n; j++) {
				b[j] = scanner.nextInt();
			}
			res[i] = getResult(n, k, a, b);
		}
		scanner.close();
		//Output
		for (int i : res) {
			System.out.println(i);
		}
	}
}
