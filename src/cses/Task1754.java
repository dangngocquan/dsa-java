package cses;

import java.util.Scanner;

/**
 * 
 * @author Bris
 * @since 1:37:40 PM - Jan 20, 2023
 *
 */
public class Task1754 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringBuilder str = new StringBuilder();
		int t = scanner.nextInt();
		while (t-- > 0) {
			long a = scanner.nextLong();
			long b = scanner.nextLong();
			// 1x + 2y = a
			// 2x + 1y = b
			if ((a + b) % 3 == 0) {
				long xy = (a+b)/3;
				if (a >= xy && b >= xy) {
					str.append("YES\n");
				}else {
					str.append("NO\n");
				}
			}else {
				str.append("NO\n");
			}
		}
		System.out.println(str);
		scanner.close();
	}
}
