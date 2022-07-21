package codeforces;

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
		int count = 0;
		for (int i = 1; i <= n; i++) {
			a[i] = scanner.nextInt();
			if (a[i] == a[i-1] && a[i] != 3) {
				a[i] = 0;
			}else if (a[i] == 3 && a[i-1] != 3) {
				a[i] = 3 - a[i-1];
			}
			if (a[i] == 0) {
				count++;
			}
		}
		scanner.close();
		
		System.out.println(count);
	}
}
