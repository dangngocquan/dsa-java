package codeForce;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/problemset/problem/448/A"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 8:20:05 AM -  May 2, 2022
 */
public class A448 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a1 = scanner.nextInt();
		int a2 = scanner.nextInt();
		int a3 = scanner.nextInt();
		int b1 = scanner.nextInt();
		int b2 = scanner.nextInt();
		int b3 = scanner.nextInt();
		int n= scanner.nextInt();
		scanner.close();
		
		int minShelevesNeed = (int)Math.ceil((a1 + a2 + a3)* 1.0 / 5) + (int)Math.ceil((b1 + b2 + b3)* 1.0 / 10);
		System.out.println((minShelevesNeed <= n)? "YES" : "NO");
	}
}
