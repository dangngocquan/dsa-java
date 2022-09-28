package codeforces;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/problemset/problem/1560/D"> Link </a>
 * @author Bris
 * @since 9:13:38 PM - Sep 27, 2022
 *
 */
public class D1560 {
	public static List<String> data;
	
	public static int countOperations(String num, String result) {
		int tempIndex = 0;
		for (int i = 0; i < num.length(); i++) {
			if (num.charAt(i) == result.charAt(tempIndex)) {
				tempIndex++;
				if (tempIndex >= result.length()) {
					return num.length() - result.length();
				}
			}
		}
		return num.length() - tempIndex + result.length() - tempIndex;
	}
	
	public static int solve(String num) {
		int ans = num.length() + 1;
		for (String resultString: data) {
			if (resultString.length() > 2*num.length()) {
				break;
			}
			ans = Math.min(ans, countOperations(num, resultString));
		}
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		data = new LinkedList<>();
		for (long i = 0; i <= 64; i++) {
			data.add(((long)1<<i) + "");
		}
		int t = scanner.nextInt();
		while (t-- > 0) {
			String num = scanner.next();
			System.out.println(solve(num));
		}
		scanner.close();
	}
}
