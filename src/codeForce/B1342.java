package codeForce;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/problemset/problem/1342/B"
 * @author Bris
 * @version 1.0
 * @since 10:17:24 PM -  May 1, 2022
 */
public class B1342 {
	public static String getResult(String s) {
		int[] counter = new int[2];
		for (int i = 0; i < s.length(); i++) {
			counter[s.charAt(i) - '0']++;
		}
		if (counter[0] == 0 || counter[1] == 0) {
			return s;
		}
		String ans = s.charAt(0) + "";
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) != s.charAt(i-1)) {
				ans += s.charAt(i);
			}else {
				if (s.charAt(i) == '0') {
					ans += "10";
				}else {
					ans += "01";
				}
			}
		}
		if (ans.length() % 2 != 0) {
			if (ans.charAt(ans.length() - 1) == '0') {
				ans += "1";
			}else {
				ans += "0";
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-->0) {
			String s = scanner.next();
			System.out.println(getResult(s));
		}
		scanner.close();
	}
}
