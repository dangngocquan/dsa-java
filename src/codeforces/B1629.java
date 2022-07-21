package codeforces;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1629/problem/B"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 11:09:02 AM -  Jun 25, 2022
 */
public class B1629 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int l = scanner.nextInt();
			int r = scanner.nextInt();
			int k = scanner.nextInt();
			if (l == r) {
				System.out.println((l >1)? "YES" : "NO");
			}else if (r-l + 1 == 2) {
				System.out.println((k >= 1)? "YES" : "NO");
			}else {
				int oddCount = ((r-l+1) % 2 == 0)? (r-l+1)/2 : ((r-l+1)/2 + ((r % 2 != 0)? 1 : 0));
				System.out.println((k >= oddCount)? "YES": "NO");
			}
		}
		scanner.close();
	}
}
