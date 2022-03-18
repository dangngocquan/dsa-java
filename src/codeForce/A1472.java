package codeForce;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A1472 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/1472/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 2:57:13 PM -  Mar 18, 2022
 */
public class A1472 {
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
			int w = scanner.nextInt();
			int h = scanner.nextInt();
			int n = scanner.nextInt();
			int S = w*h;
			while (w%2==0) w/=2;
			while (h%2==0) h/=2;
			if (S/(w*h)>=n) {
				res[i] = "YES";
			}else {
				res[i] = "NO";
			}
		}
		scanner.close();
		//Output
		for (String i: res) {
			System.out.println(i);
		}
 	}
}
