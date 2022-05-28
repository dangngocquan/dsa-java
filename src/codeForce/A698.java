package codeForce;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/698/problem/A"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 8:24:11 PM -  May 28, 2022
 */
public class A698 {
	public static boolean check(int[] a, int index, int value) {
		return (value!= a[index+1] && value != a[index-1]);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n+2];
		int[] b = new int[n+2];
		for (int i = 1; i <= n; i++) {
			a[i] = scanner.nextInt();
			b[i] = a[i];
		}
		scanner.close();
		
		for (int turn = 1; turn <= n; turn++) {
			for (int i = 1; i <= n; i++) {
				if (a[i] == 1) {
					if (a[i+1] == 3) {
						a[i+1] = 2;
					}
					if (a[i-1] == 3) {
						a[i-1] = 2;
					}
				}else if (a[i] == 2) {
					if (a[i+1] == 3) {
						a[i+1] = 1;
					}
					if (a[i-1] == 3) {
						a[i-1] = 1;
					}
				}
			}
		}
		
		for (int i = 1; i < n; i++) {
			if (a[i] == a[i+1]) {
				if (a[i] != b[i]) {
					a[i] = 0;
				}else if (a[i+1] != b[i+1]) {
					a[i+1] = 0;
				}else {
					a[i+1] = 0;
				}
			}
		}
		
		int count = 0;
		for (int i = 1; i <= n; i++) {
			count += (a[i] == 0)? 1 : 0;
		}
		
		System.out.println(count);
		for (int i = 1; i <= n; i++) {
			System.out.print(a[i] + " ");		}
	}
}
