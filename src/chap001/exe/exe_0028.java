package chap001.exe;

import java.util.Scanner;

public class exe_0028 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[] a = new int[2*n+1];
		for (int i = 1; i <= 2*n; i++) a[i] = scanner.nextInt();
		scanner.close();
		//Solve
		long[] b = new long[2*n+1];
		b[0] = 1;
		b[2] = 1;
		for (int i = 4; i <= 2*n; i+=2) {
			int x = i-2;
			for (int j = 0; j <= x; j+= 2) {
				b[i] += (b[j]*b[x-j])%1000003;
				b[i] %= 1000003;
			}
		}
		
		int start = 1;
		long ans = 1;
		for (int i = 2; i <= 2*n; i+=2) {
			if (a[i] - a[start] > m) {
				ans *= b[i-2-start+1];
				ans %= 1000003;
				start = i-2+1;
				i -= 2;
			}else if (i==2*n) {
				ans *= b[i-start+1];
			}
		}
		//Output
		System.out.println(ans);
	}
}
