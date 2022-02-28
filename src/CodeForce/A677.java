package CodeForce;

import java.util.Scanner;

public class A677 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int h = scanner.nextInt();
		int[] a = new int[n];
		int count = 0;
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
			if (a[i] > h) count++;
		}
		scanner.close();
		//Solve
		int res = n+ count;
		//Output
		System.out.println(res);
	}
}
