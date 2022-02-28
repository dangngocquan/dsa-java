package codeForce;

import java.util.Scanner;

public class B978 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String s = scanner.next();
		scanner.close();
		//Solve
		int ans = 0;
		for (int i = 0; i <= n-3; i++) {
			if (s.substring(i,i+3).equals("xxx")) ans++;
		}
		//Output
		System.out.println(ans);
	}
}
