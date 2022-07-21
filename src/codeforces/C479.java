package codeforces;

import java.util.Scanner;

/**
 * 
 * <a href = "https://codeforces.com/problemset/problem/479/C"> Link </a>
 * 
 * @author Bris
 * @version 1.0
 * @since 11:59:23 AM -  Mar 25, 2022
 */
public class C479 {
	/**
	 * 
	 * The main method.
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
		
		for (int turn = 1; turn <= n; turn++) {
			for (int i = 0; i < n- 1; i++) {
				if (a[i] > a[i+1]) {
					int tempA = a[i];
					a[i] = a[i+1];
					a[i+1] = tempA;
					int tempB = b[i];
					b[i] = b[i+1];
					b[i+1] = tempB;
				}else if (a[i] == a[i+1]) {
					if (b[i] > b[i+1]) {
						int tempA = a[i];
						a[i] = a[i+1];
						a[i+1] = tempA;
						int tempB = b[i];
						b[i] = b[i+1];
						b[i+1] = tempB;
					}
				}
			}
		}
		
		int tempDay = b[0];
		for (int i = 1; i < n; i++) {
			if (tempDay <= b[i]) {
				tempDay = b[i];
			}else {
				tempDay = a[i];
			}
		}
		
		System.out.println(tempDay);
	}
}
