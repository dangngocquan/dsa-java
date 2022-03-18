package codeForce;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A466 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/466/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 1:00:46 PM -  Mar 18, 2022
 */
public class A466 {
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
		int m = scanner.nextInt();
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		scanner.close();
		//Solve
		int coins = 0;
		if (b <= m*a) {
			coins = (n/m)*b;
			n %= m ;
			if (n*a > b) {
				coins += b;
			}else {
				coins += n*a;
			}
		}else {
			coins = n*a;
		}
		//Output
		System.out.println(coins);
	}
}
