package codeForce;

import java.util.Scanner;

/**
 * 
 * This program is used to solve A1095 problem.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/1095/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 1:02:13 PM -  Mar 21, 2022
 */
public class A1095 {
	/**
	 * 
	 * The main method - entry point of this program.
	 * 
	 * @param args Unused.
 	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String encryptedString = scanner.next();
		scanner.close();
		
		int temp = 0;
		String ans = "";
		for (int i = 0; i < n; i++) {
			ans += encryptedString.charAt(i);
			i += temp;
			temp++;
		}
		
		System.out.println(ans);
	}
}
