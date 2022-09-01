package codeforces;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * <a href = "https://codeforces.com/problemset/problem/1703/D"> Link </a>
 * @author Bris
 * @since 8:03:13 PM - Aug 31, 2022
 *
 */
public class D1703 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			String[] arrayString = new String[n];
			Set<String>[] data = new Set[9];
			for (int i = 0; i < 9; i++) {
				data[i] = new LinkedHashSet<>();
			}
			for (int i = 0; i < n; i++) {
				String s = scanner.next();
				arrayString[i] = s;
				data[s.length()].add(s);
			}
			for (int i = 0; i < n; i++) {
				String tempStr = arrayString[i];
				int len = tempStr.length();
				if (len == 1) {
					System.out.print(0);
					continue;
				}
				boolean found = false;
				for (int firstSize = 1; firstSize <= len-1; firstSize++) {
					String tempStr1 = tempStr.substring(0, firstSize);
					String tempStr2 = tempStr.substring(firstSize);
					if (data[firstSize].contains(tempStr1) && data[len-firstSize].contains(tempStr2)) {
						found = true;
						break;
					}
				}
				System.out.print(found? 1 : 0);
			}
			System.out.println();
		}
		scanner.close();
	}
}
