package codeForce;

import java.util.Scanner;

public class A1527 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] ans = new int[t];
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			if (n<=1) {
				ans[i] = 0;
				continue;
			}
			String s = Integer.toBinaryString(n);
			int count1 = 0;
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == '1') {
					count1++;
				}else {
					ans[i] = (int)Math.pow(2, s.length()-j) - 1;
					break;
				}
				if (count1 == 2) {
					ans[i] =(int) Math.pow(2, s.length()-j) - 1;
					break;
				}
			}
		}
		scanner.close();
		//Output
		for (int i : ans) System.out.println(i);
	}
}
