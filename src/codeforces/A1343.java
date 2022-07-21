package codeforces;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A1343 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/1343/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 1:34:47 PM -  Mar 18, 2022
 */
public class A1343 {
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
		int[] res= new int[t];
		int[] k = new int[30];
		for (int i = 1; i < 30;i++) k[i] = (int)Math.pow(2, i) -1;
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			for (int j = 2; j < 30; j++) {
				if (n%k[j] == 0) {
					res[i] = n/k[j];
					break;
				}
			}
		}
		scanner.close();
		//Output
		for (int i : res) {
			System.out.println(i);
		}
	}
}
