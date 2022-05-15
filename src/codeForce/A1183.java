package codeForce;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1183/problem/A"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 11:43:22 PM -  May 15, 2022
 */
public class A1183 {
	public static int getSumDigits(int n) {
		int ans = 0;
		while (n > 0) {
			ans += n % 10;
			n /= 10;
		}
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		
		while (getSumDigits(n) % 4 != 0) {
			n += 1;
		}
		System.out.println(n);
	}
}
