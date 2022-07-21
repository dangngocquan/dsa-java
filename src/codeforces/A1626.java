package codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class A1626 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		String[] s = new String[t];
		for (int i = 0; i < t; i++) s[i] = scanner.next();
		scanner.close();
		//Solve + Output
		for (String i : s) {
			char[] a = i.toCharArray();
			Arrays.sort(a);
			for (char j : a) System.out.print(j);
			System.out.println();
		}
	}
}
