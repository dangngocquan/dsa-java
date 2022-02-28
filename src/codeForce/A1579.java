package codeForce;

import java.util.Scanner;

public class A1579 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		String[] res = new String[t];
		for (int i = 0; i < t; i++) {
			String s = scanner.next();
			int countA = 0;
			int countB = 0;
			int countC = 0;
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == 'A') {
					countA++;
				}else if (s.charAt(j) == 'B') {
					countB++;
				}else {
					countC++;
				}
			}
			res[i] ="NO";
			if (countB== countA+countC) {
				res[i] = "YES";
			}
		}
		scanner.close();
		//Output
		for (String i: res) System.out.println(i);
	}
}
