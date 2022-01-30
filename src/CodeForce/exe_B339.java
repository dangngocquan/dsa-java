package CodeForce;

import java.util.Scanner;

public class exe_B339 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[] a = new int[m+1];
		for (int i = 1; i <= m; i++  ) {
			a[i] = scanner.nextInt();
		}
		scanner.close();
		//Solve
		long res = 0;
		int location = 1;
		for (int i = 1; i <= m; i++) {
			if (a[i] >= location) {
				res += a[i] - location;
			}else {
				res += n - location + a[i];
			}
			location = a[i];
		}
		//Output
		System.out.println(res);
	}
}
