package codeforces;

import java.util.Scanner;

public class B1473 {
	static int gcd(int x, int y) {
		if (y == 0) return x;
		return gcd(y,x%y);
	}
	
	static int BCNN(int x, int y) {
		return x*y/gcd(x,y);
	}
	
	static String copyString(String s, int k) {
		String ans = "";
		for (int i = 0; i < k; i++) ans += s;
		return ans;
	}
	
	static String LCM(String s1, String s2) {
		int BCNN1 = BCNN(s1.length(), s2.length());
		String s3 = copyString(s1, BCNN1/s1.length());
		String s4 = copyString(s2, BCNN1/s2.length());
		if (s3.equals(s4)) return s3;
		return "-1";
	}
	
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		String[] ans = new String[t];
		for (int i = 0; i < t; i++) {
			String s1 = scanner.next();
			String s2 = scanner.next();
			ans[i] = LCM(s1, s2);
		}
		scanner.close();
		//Output
		for (String i : ans) System.out.println(i);
	}
}
