package codeForce;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A1409 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/1409/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 6:49:24 AM -  Mar 18, 2022
 */
public class A1409 {
	/**
	 * 
	 * This method is used to get the minimum number of moves required to obtain b from a.
	 * 
	 * @param a is the first number.
	 * @param b is the secod number.
	 * @return Return the minimum number of moves required to obtain b from a.
	 */
	public static int getResult(int a, int b) {
		int res = (int)(Math.ceil((Math.abs(a-b))*1.0/10));
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
		for (int i =0; i < t; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			res[i] = getResult(a, b);
		}
		scanner.close();
		//Output
		for (int i : res) {
			System.out.println(i);
		}
	}
}
