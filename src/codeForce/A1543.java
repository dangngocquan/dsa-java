package codeForce;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/problemset/problem/1543/A"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 4:47:27 PM -  May 2, 2022
 */
public class A1543 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-->0) {
			long a = scanner.nextLong();
			long b = scanner.nextLong();
			if (a == b) {
				System.out.println("0 0");
				continue;
			}
			
			long sub = Math.abs(a - b);
			if (a % sub == 0 && b % sub == 0) {
				System.out.println(sub + " " + "0");
				continue;
			}
			
			long numMoves = Math.min(sub - a % sub, a % sub);
			System.out.println(sub + " " + numMoves);
			
		}
		scanner.close();
	}
}
