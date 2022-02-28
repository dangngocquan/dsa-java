package CodeForce;

import java.util.Scanner;

public class A1348 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] res = new int[t];
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			int sum1  = (int)(Math.pow(2, n)) + 2*((int)(Math.pow(2, n/2-1)) -1);
			int sum2 = 2*((int)(Math.pow(2, n)-1)) - sum1;
			res[i] = Math.abs(sum2 - sum1);
		}
		scanner.close();
		//Output
		for (int i : res) {
			System.out.println(i);
		}
	}
}
