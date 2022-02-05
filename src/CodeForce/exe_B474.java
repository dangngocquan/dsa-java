package CodeForce;

import java.util.Scanner;

public class exe_B474 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] res = new int[1000001];
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			int x = scanner.nextInt();
			for (int j = sum+1; j <= sum+x; j++) res[j] = i;
			sum += x;
		}
		int m = scanner.nextInt();
		int[] a = new int[m];
		for (int i = 0; i< m; i++) {
			a[i] = res[scanner.nextInt()];
		}
		scanner.close();
		//Output
		for (int i : a) System.out.println(i);
	}
}
