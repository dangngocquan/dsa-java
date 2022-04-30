package other.test;

import java.util.Scanner;

public class Test021 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] n = new int[t];
		n = input(t, scanner);
		scanner.close();
		
		for (int i = 0; i < t; i++) {
			System.out.println(getSum(n[i]));
		}
	}
	
	public static int[] input(int t, Scanner scanner) {
		int[] n = new int[t];
		for (int i = 0; i < t; i++) {
			n[i] = scanner.nextInt();
		}
		return n;
	}
	
	public static long getSum(int n) {
		long sum = 0;
		for (int i = 1; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				if (i * i == n) {
					sum += i;
				}else {
					sum += i + n / i;
				}
			}
		}
		return sum;
	}
}
