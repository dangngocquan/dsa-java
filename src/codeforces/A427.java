package codeforces;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A427 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/427/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 11:14:35 PM -  Mar 17, 2022
 */
public class A427 {
	/**
	 * 
	 * The main method - entry point of this app.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		//Input + solve
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int res = 0;
		int policeCount = 0;
		for (int i = 0; i < n; i++) {
			int x = scanner.nextInt();
			if (x==-1) {
				if (policeCount==0) {
					res++;
				}else {
					policeCount--;
				}
			}else {
				policeCount+=x;
			}
		}
		scanner.close();
		//Output
		System.out.println(res);
	}
}
