package codeForce;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A116 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/116/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 4:23:17 PM -  Mar 17, 2022
 */
public class A116 {
	/**
	 * 
	 * The main method - entry point of this app.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
			b[i] = scanner.nextInt();
		}
		scanner.close();
		
		//res - the minimum possible capacity of the tram
		int res = b[0];
		
		//temp - the temporary value
		int temp = b[0];
		for (int i = 1; i < n -1; i++) {
			temp = temp - a[i] + b[i];
			if (temp > res) {
				res = temp;
			}
		}
		
		System.out.println(res);
	}
}
