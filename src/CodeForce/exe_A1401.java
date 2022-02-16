package CodeForce;

import java.util.Scanner;

public class exe_A1401 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] ans = new int[t];
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			int k = scanner.nextInt();
			if ((n-k)%2==0) {
				if (n<k) ans[i] = k-n;
			}else {
				if (n<k) {
					ans[i] = k-n;
				}else {
					ans[i] = 1;
				}
			}
		}
		scanner.close();
		//Output
		for (int i : ans) System.out.println(i);
	}
}
