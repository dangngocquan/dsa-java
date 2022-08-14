package codeforces;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1593/problem/B"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 3:57:28 PM -  Aug 14, 2022
 */
public class B1593 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			String s = scanner.next();
			int ans = 0;
			List<String> list = new LinkedList<>();
			for (int i = s.length() - 1; i >= 0; i--) {
				char ch = s.charAt(i);
				if (list.size() == 0) {
					if (ch == '0' || ch == '5') {
						list.add(ch + "");
					}else {
						ans++;
					}
				}else {
					boolean found = false;
					for (String str : list) {
						if (Integer.valueOf(ch + str) % 25 == 0) {
							found = true;
							ans += list.size() - 1;
							break;
						}
					}
					if (found) {
						break;
					}
					
					if (ch == '0' || ch == '5') {
						list.add(ch + "");
					}else {
						ans++;
					}
				}
			}
			System.out.println(ans);
		}
		scanner.close();
	}
}
