package codeForce;

import java.util.Scanner;

public class A1647 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-->0) {
			int n = scanner.nextInt();
			if (n <= 2) {
				System.out.println(n);
			}else {
				String ans = "2";
				n -= 2;
				while (n>=2) {
					if (ans.charAt(0) == '1') {
						ans = "2" + ans;
						n -= 2;
					}else if (ans.charAt(ans.length()-1) == '1') {
						ans += "2";
						n -= 2;
					}else {
						ans += "1";
						n--;
					}
				}
				if (n==1) {
					if (ans.charAt(ans.length()-1) == '2') {
						ans += "1";
					}else {
						ans = "1" + ans;
					}
				}
				System.out.println(ans);
			}
		}
		scanner.close();
	}
}
