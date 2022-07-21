package codeforces;

import java.util.Scanner;

/**
 * <a href = "https://codeforces.com/contest/550/problem/C"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 4:17:57 PM -  May 28, 2022
 */
public class C550 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String n = scanner.next();
		scanner.close();
		
		for (int i = 0; i < n.length(); i++) {
			int temp = Integer.parseInt(n.charAt(i) + "");
			if (temp % 8 == 0) {
				System.out.println("YES");
				System.out.println(temp);
				return;
			}
			for (int j = i+1; j < n.length(); j++) {
				int temp1 = Integer.parseInt(temp + "" + n.charAt(j));
				if (temp1 % 8 == 0) {
					System.out.println("YES");
					System.out.println(temp1);
					return;
				}
				for (int k = j+1; k < n.length(); k++) {
					int temp2 = Integer.parseInt(temp1 + "" + n.charAt(k));
					if (temp2 % 8 == 0) {
						System.out.println("YES");
						System.out.println(temp2);
						return;
					}
				}
			}
		}
		
		System.out.println("NO");
	}
}
