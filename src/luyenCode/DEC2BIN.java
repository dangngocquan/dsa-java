package luyenCode;

import java.util.Scanner;

public class DEC2BIN {
	static void solve(long x) {
		String s = "";
		while (x > 0) {
			s = (char)(x%2 + 48) + s;
			x /= 2;
		}
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		long[] n = new long[t];
		for (int i = 0; i < t; i++) n[i] = scanner.nextLong();
		scanner.close();
		//Output
		for (long i : n) solve(i);
	}
}
