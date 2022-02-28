package codeForce;

import java.util.Arrays;
import java.util.Scanner;

public class B451 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n+1];
		int[] b = new int[n+1];
		for (int i = 1; i <= n; i++) {
			int x = scanner.nextInt();
			a[i] = x;
			b[i] = x;
		}
		scanner.close();
		//Solve
		Arrays.sort(b);
		int start = 1;
		int end = 1;
		for (int i = 1; i <= n; i++) {
			if (a[i] != b[i]) {
				start = i;
				break;
			}
		}
		for (int i = n; i >= 1; i--) {
			if (a[i] != b[i]) {
				end = i;
				break;
			}
		}
		//Output
		boolean check = true;
		for (int i = start; i <= end; i++) {
			if (a[i] != b[end - (i-start)]) {
				check = false;
				break;
			}
		}
		if (check) {
			System.out.println("yes");
			System.out.println(start + " " + end);
		}else {
			System.out.println("no");
		}
	}
}
