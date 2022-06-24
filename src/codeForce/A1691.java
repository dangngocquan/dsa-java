package codeForce;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1691/problem/A"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 12:57:00 AM -  Jun 25, 2022
 */
public class A1691 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while(t-- > 0) {
			int n = scanner.nextInt();
			int oddCount = 0;
			int evenCount = 0;
			for (int i = 0; i < n; i++) {
				if (scanner.nextInt() % 2== 0) {
					evenCount++;
				}else {
					oddCount++;
				}
			}
			System.out.println((oddCount > evenCount)? evenCount : oddCount);
		}
		scanner.close();
	} 
}
