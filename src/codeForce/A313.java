package codeForce;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A313 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/313/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 1:11:16 PM -  Mar 18, 2022
 */
public class A313 {
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
		//Output
		if (n>=0) {
			System.out.println(n);
		}else {
			n= -n;
			if (n%10 > (n/10) %10) {
				System.out.println(-n/10);
			}else {
				System.out.println(-((n/100)*10+n%10));
			}
			
		}	
	}
}
