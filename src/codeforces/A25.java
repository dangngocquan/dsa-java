package codeforces;

import java.util.Scanner;

/**
 * 
 * This class is used to solve A25 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/25/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 6:46:27 PM -  Mar 17, 2022
 */
public class A25 {
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
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		scanner.close();
		//Solve
		//evenCount - the number of even numbers.
		int evenCount = 0;
		
		//oddCount - the number of odd numbers.
		int oddCount = 0;
		for (int i = 0; i < 3; i++) {
			if (a[i] % 2== 0) {
				evenCount++;
			}else {
				oddCount++;
			}
		}
		
		//res - the index of number that differs from the others in evenness.
		int res = 0;
		if (evenCount> oddCount) {
			for (int i = 0; i < n; i++) {
				if (a[i]%2 == 1) {
					res = i+1;
					break;
				}
			}
		}else {
			for (int i = 0; i < n; i++) {
				if (a[i]%2 == 0) {
					res = i+1;
					break;
				}
			}
		}
		//Output
		System.out.println(res);
	}
}
