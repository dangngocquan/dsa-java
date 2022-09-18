package codeforces;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/problemset/problem/1399/D"> Link </a>
 * @author Bris
 * @since 4:01:50 PM - Sep 17, 2022
 *
 */
public class D1399 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		StringBuilder str = new StringBuilder();
		while (t-- > 0) {
			int n = scanner.nextInt();
			int[] groupOfChar = new int[n];
			String s = scanner.next();
			List<Integer> list = new LinkedList<>();
			for (int i = 0; i < n; i++) {
				int value = s.charAt(i) - '0';
				int index = list.indexOf(1 - value);
				if (index == -1) {
					list.add(value);
					groupOfChar[i] = list.size();
				}else {
					list.set(index, value);
					groupOfChar[i] = index + 1;
				}
			}
			
			str.append(list.size()).append("\n");
			for (int i : groupOfChar) {
				str.append(i).append(" ");
			}
			str.append("\n");
		}
		System.out.println(str);
		scanner.close();
	}
}
