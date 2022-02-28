package codeForce;

import java.util.Scanner;

public class B313 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		int m = scanner.nextInt();
		int[] l = new int[m];
		int[] r = new int[m];
		for (int i = 0; i < m; i++) {
			l[i] = scanner.nextInt();
			r[i] = scanner.nextInt();
		}
		scanner.close();
		//Solve
		int[] res = new int[s.length()+1];
		for (int i = 2; i <= s.length(); i++) {
			if (s.charAt(i-1) == s.charAt(i-2)) {
				res[i] = res[i-1]+1;
			}else {
				res[i] = res[i-1];
			}
		}
		//Output
		for (int i = 0; i <m; i++) {
			System.out.println(res[r[i]] - res[l[i]]);
		}
	}
}
