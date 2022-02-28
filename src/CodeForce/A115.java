package CodeForce;

import java.util.Scanner;

public class A115 {
	static int getLength(int k, int[] p) {
		if (p[k] == -1) return 1;
		return 1+ getLength(p[k], p);
	}
	
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] p = new int[n+1];
		for (int i = 1; i <= n; i++) p[i] = scanner.nextInt();
		scanner.close();
		//Solve
		int ans = 0;
		for (int i = 1; i <= n; i++) {
			ans = Math.max(ans, getLength(i, p));
		}
		//Output
		System.out.println(ans);
	}
}
