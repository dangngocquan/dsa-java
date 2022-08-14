package codeforces;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1618/problem/B"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 3:15:00 PM -  Aug 14, 2022
 */
public class B1618 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			List<String> list = new LinkedList<>();
			for (int i = 0; i < n-2; i++) {
				list.add(scanner.next());
			}
			String ans = "";
			if (list.size() == 1) {
				ans = list.get(0) + 'a';
			}else {
				ans += list.get(0).charAt(0);
				for (int i = 1; i <= n-3; i++) {
					if (list.get(i).charAt(0) == list.get(i-1).charAt(1)) {
						ans += "" + list.get(i).charAt(0);
					}else {
						ans += "" + list.get(i-1).charAt(1) + "" + list.get(i).charAt(0);
					}
				}
				ans += list.get(list.size()-1).charAt(1);
				if (ans.length() < n) {
					ans += "" + 'a';
				}
			}
			System.out.println(ans);
		}
		scanner.close();
	}
}
