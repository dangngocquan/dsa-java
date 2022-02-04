package CodeForce;

import java.util.Scanner;

public class exe_A1454 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		String[] res = new String[t];
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			int[] a = new int[n+1];
			for (int j=1; j <= n; j++) a[j] = n+1-j;
			if (n>2) {
				int k = n/2 + 1;
				a[k] += a[k+1];
				a[k+1] = a[k] - a[k+1];
				a[k] = a[k] - a[k+1];
			}
			res[i] = "";
			for (int j = 1; j <= n; j++) res[i] += a[j]+" ";
		}
		scanner.close();
		//Output
		for (String i : res) System.out.println(i);
	}
}
