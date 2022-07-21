package codeforces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * This program is used to solve B1398 problem in codeforce.
 * The link of this problem is <a href = "https://codeforces.com/problemset/problem/1398/B"> here </a>.
 * 
 * @author Bris
 * @version 1.0
 * @since 7:45:10 PM -  Mar 20, 2022
 */
public class B1398 {
	/**
	 * 
	 * The main method - entry point of this program.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-->0) {
			String s = scanner.next();
			List<Integer> list = new ArrayList<Integer>();
			int tempCount = 0;
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == '1') {
					tempCount++;
				}else {
					if (tempCount > 0) {
						list.add(tempCount);
						tempCount = 0;
					}
				}
			}
			if (tempCount > 0) {
				list.add(tempCount);
			}
			Collections.sort(list);
			int ans = 0;
			for (int i = list.size()-1; i >= 0; i -= 2) {
				ans += list.get(i);
			}
			System.out.println(ans);
		}
		scanner.close();
	}
}
