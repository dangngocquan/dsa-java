package codeforces;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A472 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/472/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 12:49:17 PM -  Mar 18, 2022
 */
public class A472 {
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
		scanner.close();
		//Solve
		int x = 0;
		int y = 0;
		if (n%2==0) {
			x = 4;
			y = n-4;
		}else {
			if (n%3==0) {
				x = 6;
				y = n -6;
			}else if (n%3 == 1) {
				x = 4;
				y = n-4;
			}else {
				x = 8;
				y = n-8;
			}
		}
		//Output
		System.out.print(x + " " + y );
	}
}
