package codeforces;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A1475 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/1475/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 1:55:48 PM -  Mar 18, 2022
 */
public class A1475 {
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
			long n = scanner.nextLong();
			res[i] = "NO";
			if (n%2==1) {
				res[i] = "YES";
			}else {
				while (n>1) {
					n /= 2;
					if (n%2==1 && n>1) {
						res[i] = "YES";
						break;
					}
				}
			}
		}
		scanner.close();
		//Output
		for (String i : res) {
			System.out.println(i);
		}
	}
}
