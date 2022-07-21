package codeforces;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A1311 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/1311/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 3:03:51 PM -  Mar 18, 2022
 */
public class A1311 {
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
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			if (a>b) {
				if ((a-b)%2==1) {
					res[i] = 2;
				}else {
					res[i] = 1;
				}
			}else if (a<b){
				if ((b-a)%2==1) {
					res[i] = 1;
				}else {
					res[i] = 2;
				}
			}
		}
		scanner.close();
		//Output
		for (int i: res) System.out.println(i);
	}
}
