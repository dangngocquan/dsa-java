package CodeForce;

import java.util.Scanner;

public class exe_A25 {
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
		int evenCount = 0;
		int oddCount = 0;
		for (int i = 0; i < 3; i++) {
			if (a[i] % 2== 0) {
				evenCount++;
			}else {
				oddCount++;
			}
		}
		int res = 0;
		if (evenCount> oddCount) {
			for (int i = 0; i < n; i++) {
				if (a[i]%2 == 1) {
					res = i+1;
					break;
				}
			}
		}else {
			for (int i = 0; i < n; i++) {
				if (a[i]%2 == 0) {
					res = i+1;
					break;
				}
			}
		}
		//Output
		System.out.println(res);
	}
}
