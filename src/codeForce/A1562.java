package codeForce;

import java.util.Scanner;

public class A1562 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-->0) {
			int l = scanner.nextInt();
			int r = scanner.nextInt();
			int ans = 0;
			if ((r+1)/2 >= l) {
				ans = (r-1)/2;
			}else {
				ans = r%l;
			}
			System.out.println(ans);
		}
		scanner.close();
	}
}
