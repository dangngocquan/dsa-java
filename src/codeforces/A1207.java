package codeforces;

import java.util.Scanner;

/**
 * 
 * <a href = "https://codeforces.com/contest/1207/problem/A"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 8:51:55 PM -  Aug 13, 2022
 */
public class A1207 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int b = scanner.nextInt();
			int p = scanner.nextInt();
			int f = scanner.nextInt();
			int h = scanner.nextInt();
			int c = scanner.nextInt();
			int ans = 0;
			int food1, food2, cost1, cost2;
			if (h >= c) {
				food1 = p;
				food2 = f;
				cost1 = h;
				cost2 = c;
			}else {
				food1 = f;
				food2 = p;
				cost1 = c;
				cost2 = h;
			}
			
			if (b >= food1*2) {
				ans += food1 * cost1;
				b -= 2*food1;
			}else {
				ans += (b/2)*cost1;
				b %= 2;
			}
			
			if (b >= food2*2) {
				ans += food2*cost2;
				b -= 2*food2;
			}else {
				ans += (b/2)*cost2;
				b %= 2;
			}
			System.out.println(ans);
		}
		scanner.close();
	}
}
