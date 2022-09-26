package codeforces;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/problemset/problem/1355/D"> Link </a>
 * @author Bris
 * @since 10:34:30 PM - Sep 26, 2022
 *
 */
public class D1355 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int S = scanner.nextInt();
		StringBuilder s = new StringBuilder();
		if (S/N == 1) {
			s.append("NO");
		}else {
			s.append("YES\n");
			int value1 = S/N;
			int numOfValue1 = N - S%N;
			for (int i = 1; i <= N; i++) {
				if (i <= numOfValue1) {
					s.append(value1).append(" ");
				}else {
					s.append(value1+1).append(" ");
				}
			}
			s.append("\n1");
		}
		System.out.println(s);
		scanner.close();
	}
}
