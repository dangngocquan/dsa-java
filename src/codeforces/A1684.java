package codeforces;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/1684/problem/A"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 2:57:46 PM -  Aug 14, 2022
 */
public class A1684 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			String n = scanner.next();
			List<Character> list = new LinkedList<>();
			for (int i = 0; i < n.length(); i++) {
				list.add(n.charAt(i));
			}
			Collections.sort(list);
			if (list.size() == 2) {
				System.out.println((n.charAt(0) == list.get(0))? list.get(1) : list.get(0));
			}else {
				System.out.println(list.get(0));
			}
		}
		scanner.close();
	}
}
