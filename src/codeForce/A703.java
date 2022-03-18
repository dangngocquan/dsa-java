package codeForce;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A703 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/703/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 1:36:50 PM -  Mar 18, 2022
 */
public class A703 {
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
		int pointOfMishka = 0;
		int pointOfChris = 0;
		for (int i = 0; i < n; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			if (a>b) {
				pointOfMishka++;
			}else if (b > a) {
				pointOfChris++;
			}
		}
		scanner.close();
		//Solve + outout
		if (pointOfMishka==pointOfChris) {
			System.out.println("Friendship is magic!^^");
		}else if (pointOfMishka > pointOfChris) {
			System.out.println("Mishka");
		}else {
			System.out.println("Chris");
		}
	}
}
