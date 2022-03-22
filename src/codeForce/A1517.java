package codeForce;

import java.util.Scanner;

/**
 * 
 * This program is used to solve A1517 in codeforce.
 * The link of this program is <a href = "https://codeforces.com/problemset/problem/1517/A"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 8:06:02 PM -  Mar 22, 2022
 */
public class A1517 {
	/**
	 * 
	 * This method is used to get the sum of digits of the number n.
	 * 
	 * @param n is the number which you want to solve.
	 * @return Return the sum of the digits of the number n.
	 */
	public static int getSumOfDigits(long n) {
		int sum = 0;
		while (n > 0) {
			sum += n%10;
			n /= 10;
		}
		return sum;
	}
	
	/**
	 * 
	 * The main method - entry point of this program.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-->0) {
			long n = scanner.nextLong();
			if (n % 2050 == 0) {
				System.out.println(getSumOfDigits(n/2050));
			}else {
				System.out.println(-1);
			}
		}
		scanner.close();
	}
}
