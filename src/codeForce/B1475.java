package codeForce;

import java.util.Scanner;

/**
 * 
 * This class is used to solve B1475 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/270/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 2:51:51 PM -  Mar 18, 2022
 */
public class B1475 {
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
			// n = a.2020 + b.2021 
			res[i] = "NO";
			for (int j = 0; j <= n/2021; j++) {
				int k = n - 2021*j;
				if (k%2020==0) {
					res[i] = "YES";
					break;
				}
			}
		}
		scanner.close();
		//Output
		for (String i: res) {
			System.out.println(i);
		}
	}
}
