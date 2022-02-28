package CodeForce;

import java.util.Scanner;

public class A1368 {
	public static void main(String[] args) {
		//Input
		Scanner scanner =new Scanner(System.in);
		int t = scanner.nextInt();
		int[] ans = new int[t];
		for (int i = 0; i < t; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int n = scanner.nextInt();
			while (a<= n && b <= n) {
				if (a<= b) {
					a += b;
				}else {
					b+= a;
				}
				ans[i]++;
			}
		}
		scanner.close();
		//Output
		for (int i : ans) System.out.println(i);
	}
}
