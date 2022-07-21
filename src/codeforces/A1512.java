package codeforces;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A1512 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/1512/A" > here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 1:22:58 PM -  Mar 18, 2022
 */
public class A1512 {
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
			int defautlNumber = -1;
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = scanner.nextInt();
			if (b == a && b == c) {
				defautlNumber = b;
			}else if (a==b){
				defautlNumber = a;
				res[i] = 3;
			}else if (a==c) {
				defautlNumber = a;
				res[i] = 2;
			}else if (b==c){
				defautlNumber = b;
				res[i] = 1;
			}
			for (int j = 4; j <= n; j++) {
				if (scanner.nextInt() != defautlNumber) res[i] = j;
			}
		}
		scanner.close();
		//Output
		for (int i: res) {
			System.out.println(i);
		}
	}
}
