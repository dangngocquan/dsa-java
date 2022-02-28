package codeForce;

import java.util.Scanner;

public class B1624 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		String[] ans = new String[t];
		for (int i = 0; i < t; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = scanner.nextInt();
			ans[i] = "NO";
			if (b*2-c > 0 && (b*2-c) % a == 0) {
				ans[i] = "YES";
			}else if ((a+c) %2 == 0 && ((a+c)/2)%b==0) {
				ans[i] = "YES";
			}else if ((2*b-a)>0 && (2*b-a) % c == 0) {
				ans[i] = "YES";
			}
		}
		scanner.close();
		//Output
		for (String i : ans) System.out.println(i);
	}
}
