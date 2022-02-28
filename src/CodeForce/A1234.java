package CodeForce;

import java.util.Scanner;

public class A1234 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int q = scanner.nextInt();
		int[] ans = new int[q];
		for (int i = 0; i < q; i++) {
			int n = scanner.nextInt();
			for (int j = 0; j < n; j++) ans[i] += scanner.nextInt();
			ans[i] = (int)Math.ceil(ans[i]*1.0/n);
		}
		scanner.close();
		//Output
		for (int i : ans) System.out.println(i);
	}
}
