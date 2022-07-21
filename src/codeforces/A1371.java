package codeforces;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A1371 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/1371/A" > here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 2:31:24 PM -  Mar 18, 2022
 */
public class A1371 {
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
			res[i] = (scanner.nextInt()+1)/2;
		}
		scanner.close();
		//Output
		for (int i : res) {
			System.out.println(i);
		}
	}
}
