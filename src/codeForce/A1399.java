package codeForce;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * This class is used to solve A1399 problem in codeforce.
 * The lik of this problem is <a href = "https://codeforces.com/problemset/problem/1399/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 6:45:49 AM -  Mar 18, 2022
 */
public class A1399 {
	/**
	 * 
	 * This method is used to get the result of each test case in problem.
	 * 
	 * @param n is the length of array a.
	 * @param a is a integer array.
	 * @return Return a string data type - "YES" or "NO".
	 */
	public static String getResult(int n, int[] a) {
		String res = "YES";
		Arrays.sort(a);
		for (int i = 1; i < n; i++) {
			if (a[i] - a[i-1] > 1) {
				res = "NO";
				break;
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
		String[] res = new String[t];
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			int[] a = new int[n];
			for (int j = 0; j < n; j++) {
				a[j] = scanner.nextInt();
			}
			res[i] = getResult(n, a);
		}
		scanner.close();
		//Output
		for (String i: res) {
			System.out.println(i);
		}
	}
}
