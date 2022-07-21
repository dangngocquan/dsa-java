package codeforces;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A344 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/344/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 5:41:16 PM -  Mar 17, 2022
 */
public class A344 {
	/**
	 * 
	 * The main method - entry point of this app.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String[] a = new String[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.next();
		}
		scanner.close();
		//Solve
		//res - the number of groups of magnets.
		int res = 1;
		
		//temp - a temporary string
		String temp = a[0];
		for (int i = 1; i <n ; i++) {
			if (!a[i].equals(temp)) {
				res++;
				temp = a[i];
			}
		}
		//Output
		System.out.println(res);
	}
}
