package codeForce;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/919/problem/B"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 8:12:39 PM -  May 28, 2022
 */
public class B919 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();
		scanner.close();
		
		int ans = 0;
		int numberChecking = 1;
		while (k-- > 0) {
			int copyOfNumberChecking = numberChecking;
			int sum = 0;
			while (copyOfNumberChecking > 0) {
				sum += copyOfNumberChecking % 10;
				copyOfNumberChecking /= 10;
			}
			if (sum == 10) {
				ans = numberChecking;
			}else {
				k++;
			}
			numberChecking++;
		}
		System.out.println(ans);
	}
}
