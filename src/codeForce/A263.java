package codeForce;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A263 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/263/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 2:58:20 PM Mar 17, 2022
 */
public class A263 {
	/**
	 * 
	 * The main method - entry point of this app.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//a - the index row of '1'
		int a = 0;
		
		//b - the index column of '1'
		int b = 0;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				int x = scanner.nextInt();
				if (x==1) {
					a = i;
					b = j;
				}
			}
		}
		scanner.close();
		
		System.out.println(Math.abs(a-3) + Math.abs(b-3));
	}
}
