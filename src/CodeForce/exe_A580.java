package CodeForce;

import java.util.Scanner;

public class exe_A580 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		scanner.close();
		//Solve
		int res = 1;
		int tempLength = 1;
		for (int i = 1; i < n; i++) {
			if (a[i]>= a[i-1]) {
				tempLength++;
				if (tempLength> res) res = tempLength;
			}else {
				if (tempLength>res) res = tempLength;
				tempLength = 1;
			}
		}
		//Output
		System.out.println(res);
	}
}
