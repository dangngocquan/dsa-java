package codeforces;

import java.util.Scanner;

/**
 * 
 * This class is used to solve B1343 problem in codeforce.
 * The link of this problem is <a href ="https://codeforces.com/problemset/problem/1343/B"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 1:04:28 PM -  Mar 18, 2022
 */
public class B1343 {
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
		int[] a = new int[t];
		for (int i = 0; i < t;i++) {
			a[i] = scanner.nextInt();
		}
		scanner.close();
		//Output
		for (int i: a) {
			if (i%4==0) {
				System.out.println("YES");
				for (int j = 2; j <= i; j += 2) System.out.print(j +" ");
				for (int j = 1; j <= i-3; j += 2) System.out.print(j +" ");
				System.out.println(i+i/2-1);
			}else {
				System.out.println("NO");
			}
		}
	}
}

