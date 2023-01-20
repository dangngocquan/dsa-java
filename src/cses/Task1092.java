package cses;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author Bris
 * @since 1:09:52 PM - Jan 20, 2023
 *
 */
public class Task1092 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		StringBuilder s = new StringBuilder();
		if (n%4 == 1 || n%4 == 2) {
			s.append("NO");
		}else {
			s.append("YES\n");
			List<Long> list1 = new LinkedList<>();
			List<Long> list2 = new LinkedList<>();
			long sum1 = 0;
			long sum2 = 0;
			for (long val = n; val > 0; val--) {
				if (sum1 <= sum2) {
					sum1 += val;
					list1.add(val);
				}else {
					sum2 += val;
					list2.add(val);
				}
			}
			s.append(list1.size() + "\n");
			for (Long val: list1) {
				s.append(val + " ");
			}
			s.append("\n");
			s.append(list2.size() + "\n");
			for (Long val: list2) {
				s.append(val + " ");
			}
		}
		System.out.println(s);
		scanner.close();
	}
}
