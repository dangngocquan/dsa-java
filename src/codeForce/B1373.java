package codeForce;

import java.util.Scanner;

public class B1373 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		String[] ans = new String[t];
		for (int i = 0; i < t; i++) {
			String s = scanner.next();
			int count0 = 0;
			int count1 = 0;
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == '0') {
					count0++;
				}else {
					count1++;
				}
			}
			if (Math.min(count1, count0) %2 == 1) {
				ans[i] = "DA";
			}else {
				ans[i] = "NET";
			}
 		}
		scanner.close();
		//Output
		for (String i : ans) System.out.println(i);
	}
}
