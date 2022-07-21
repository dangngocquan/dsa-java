package codeforces;

import java.util.Scanner;

public class A1327 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		String[] res = new String[t];
		for (int i = 0; i < t; i++) {
			long n = scanner.nextLong();
			long k = scanner.nextLong();
			if ((n-k) %2 == 1) {
				res[i] = "NO";
			}else {
				long min = (2*k-1+1)*k/2;
				if (n>= min) {
					res[i] = "YES";
				}else {
					res[i] = "NO";
				}
			}
		}
		scanner.close();
		//Output
		for (String i : res) System.out.println(i);
	}
}
