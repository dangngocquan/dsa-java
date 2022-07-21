package codeforces;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A1560 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/1560/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 1:52:23 PM -  Mar 18, 2022
 */
public class A1560 {
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
		int[] k = new int[t];
		for (int i = 0; i < t; i++) k[i] = scanner.nextInt();
		scanner.close();
		//Solve
		int[] res = new int[1001];
		res[1] = 1;
		for (int i = 2; i < 1001; i++) {
			res[i] = res[i-1] + 1;
			while (res[i] %3 ==0 || res[i] %10 ==3) res[i] +=1;
		}
		//Output
		for (int i : k) {
			System.out.println(res[i]);
		}
	}
}
