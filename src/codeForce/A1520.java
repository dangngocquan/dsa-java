package codeForce;

import java.util.Scanner;

public class A1520 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		String[] res = new String[t];
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			int[] arr = new int[26];
			String s = scanner.next();
			arr[s.charAt(0) - 'A'] += 1;
			res[i] = "YES";
			for (int j = 1; j < n; j++ ) {
				if (s.charAt(j) != s.charAt(j-1)) {
					if (arr[s.charAt(j) - 'A'] > 0) {
						res[i] = "NO";
						break;
					}else {
						arr[s.charAt(j) - 'A']++;
					}
				}
			}
		}
		scanner.close();
		//Output
		for (String i : res) {
			System.out.println(i);
		}
	}
}
