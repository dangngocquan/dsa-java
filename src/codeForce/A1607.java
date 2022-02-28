package codeForce;

import java.util.Scanner;

public class A1607 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] res = new int[t];
		for (int i = 0; i < t; i++) {
			String a = scanner.next();
			String s = scanner.next();
			int[] arr = new int[26];
			for (int j = 0; j < 26; j++) {
				arr[a.charAt(j) - 'a'] = j;
			}
			for (int j = 1; j < s.length(); j++) {
				res[i] += Math.abs(arr[s.charAt(j-1) - 'a'] - arr[s.charAt(j) - 'a']);
			}
		}
		scanner.close();
		//Output
		for (int i : res) System.out.println(i);
	}
}
