package codeforces;

import java.util.Scanner;

/**
 * 
 * This class is used to solve B1374 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/1374/B"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 2:28:49 PM -  Mar 18, 2022
 */
public class B1374 {
	/**
	 * 
	 * The main method - entry point of this app.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] res = new int[t];
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			res[i] = 0;
			while (n > 1) {
				if (n%3 !=0) {
					res[i] = -1;
					break;
				}else {
					if (n%6 == 0) {
						n /= 6;
						res[i]++;
					}else {
						n *= 2;
						res[i]++;
					}
				}
			}
		}
		scanner.close();
		//Output
		for (int i : res) {
			System.out.println(i);
		}
	}
}
