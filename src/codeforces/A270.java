package codeforces;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A270 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/270/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 2:49:42 PM -  Mar 18, 2022
 */
public class A270 {
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
			//180*(n-2)/n = a <=> 180n -360 = a.n <=> n.(180-a) = 360 
			res[i] = "NO";
			if (360 % (180-a) == 0) res[i] = "YES";
		}
		scanner.close();
		//Output
		for (String i: res) {
			System.out.println(i);
		}
	}
}
