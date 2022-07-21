package codeforces;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A1294 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/1294/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 3:11:26 PM -  Mar 18, 2022
 */
public class A1294 {
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
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = scanner.nextInt();
			int n = scanner.nextInt();
			int x = a+b+c+n;
			if (x%3==0 && x/3>=Math.max(Math.max(a, b), c)) {
				res[i] = "YES";
			}else {
				res[i] = "NO";
			}
		}
		scanner.close();
		//Output
		for (String i : res) System.out.println(i);
	}
}
