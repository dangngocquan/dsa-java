package codeforces;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A977 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/977/A" > here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 4:01:34 PM -  Mar 17, 2022
 */
public class A977 {
	/**
	 * 
	 * The main method - entry point of this app.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		scanner.close();
		
		for (int i = 1; i <= k; i++) {
			if (n%10 !=0) {
				n -=1;
			}else {
				n /= 10;
			}
		}
		
		System.out.println(n);
	}
}
