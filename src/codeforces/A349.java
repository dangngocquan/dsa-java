package codeforces;

import java.util.Scanner;

/**
 * 
 * <a href = "https://codeforces.com/problemset/problem/349/A> Lik </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 9:53:29 PM -  Mar 30, 2022
 */
public class A349 {
	/**
	 * 
	 * The main method.
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int count25 = 0;
		int count50 = 0;
		String ans = "YES";
		for (int i = 1; i <= n; i++) {
			int x = scanner.nextInt();
			if (x == 25) {
				count25++;
			}else if (x == 50) {
				if (count25 > 0) {
					count25--;
					count50++;
				}else {
					ans = "NO";
					break;
				}
			}else {
				if (count50 >= 1){
					if (count25 >= 1) {
						count50--;
						count25--;
					}else {
						ans = "NO";
						break;
					}
				}else {
					if (count25 >= 3) {
						count25 -= 3;
					}else {
						ans = "NO";
						break;
					}
				}
			}
		}
		System.out.println(ans);
		scanner.close();
	}
}
