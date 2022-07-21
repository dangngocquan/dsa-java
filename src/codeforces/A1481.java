package codeforces;

import java.util.Scanner;

public class A1481 {
	static String solve(int x, int y, String s) {
		int countU = 0;
		int countD = 0;
		int countR = 0;
		int countL = 0;
		for (int i = 0; i < s.length(); i++) {
			switch (s.charAt(i)) {
			case 'U':
				countU++;
				break;
			case 'D':
				countD++;
				break;
			case 'R':
				countR++;
				break;
			case 'L':
				countL++;
				break;
			}
		}
		if (x >= 0) {
			if (y >= 0) {
				if (countU >= y && countR >= x) return "YES";
				return "NO";
			}else {
				if (countD >= -y && countR >= x) return "YES";
				return "NO";
			}
		}else {
			if (y >= 0) {
				if (countU >= y && countL >= -x) return "YES";
				return "NO";
			}else {
				if (countD >= -y && countL >= -x) return "YES";
				return "NO";
			}
		}
	}
	
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-->0) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			String s = scanner.next();
			System.out.println(solve(x, y, s));
		}
		scanner.close();
	}
}
