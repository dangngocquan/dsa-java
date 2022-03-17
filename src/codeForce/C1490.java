package codeForce;

import java.util.Scanner;

/**
 * 
 * This class is used to solve 1490C problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/1490/C"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 2:39:46 PM Mar 17, 2022
 */
public class C1490 {
	/**
	 * 
	 * This method is used to check the number x if it is a cube number or not.
	 * 
	 * @param x The number which you want to check
	 * @return Return true if x is a cube number. Otherwise, return false if x isn't a cube number.
	 */
	public static boolean isCubeNumber(long x) {
		if (x <= 0) {
			return false;
		}
		long i = (long)Math.cbrt(x);
		return i*i*i == x;
	}
	
	/**
	 * 
	 * The main method - entry point of this app.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-->0) {
			long x = scanner.nextLong();
			long a = 0;
			for (long i = 1; i <= Math.cbrt(x); i++) {
				if (isCubeNumber(x-i*i*i)) {
					a = i;
					break;
				}
			}
			if (a == 0) {
				System.out.println("NO");
			}else {
				System.out.println("YES");
			}
		}
		scanner.close();
	}
}
