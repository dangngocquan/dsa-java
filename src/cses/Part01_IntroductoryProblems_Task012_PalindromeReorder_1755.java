package cses;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author Bris
 * @since 1:46:22 PM - Jan 20, 2023
 *
 */
public class Part01_IntroductoryProblems_Task012_PalindromeReorder_1755 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		int[] counter = new int[26];
		List<Character> l = new LinkedList<>();
		int oddCount = 0;
		StringBuilder s = new StringBuilder();
		for (char c : str.toCharArray()) {
			counter[c - 'A']++;
			if (!l.contains(c)) {
				l.add(c);
			}
		}
		for (int val : counter) {
			oddCount += val % 2;
		}
		if (oddCount > 1) {
			s.append("NO SOLUTION");
		} else if (oddCount == 1 && str.length() % 2 == 0) {
			s.append("NO SOLUTION");
		} else {
			for (char c : l) {
				if (counter[c - 'A'] % 2 == 0) {
					for (int tempCount = 0; tempCount < counter[c - 'A'] / 2; tempCount++) {
						s.append(c);
					}
				}
			}
			for (char c : l) {
				if (counter[c - 'A'] % 2 != 0) {
					for (int tempCount = 0; tempCount < counter[c - 'A']; tempCount++) {
						s.append(c);
					}
				}
			}
			for (int i = l.size() - 1; i >= 0; i--) {
				char c = l.get(i);
				if (counter[c - 'A'] % 2 == 0) {
					for (int tempCount = 0; tempCount < counter[c - 'A'] / 2; tempCount++) {
						s.append(c);
					}
				}
			}
		}
		System.out.println(s);
		scanner.close();
	}
}
