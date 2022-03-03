package codeForce;

import java.util.Scanner;

public class C1294 {
	static boolean isPrime(int n) {
		if (n == 1) return false;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n %i == 0) return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] a = new int[t];
		for (int i = 0; i < t; i++) a[i] = scanner.nextInt();
		scanner.close();
		//Solve + Output
		for (int n : a) {
			if (isPrime(n)) {
				System.out.println("NO");
			}else {
				int x = 1;
				for (int i = 2; i <= Math.sqrt(n); i++) {
					if (n %i == 0) {
						x = i;
						break;
					}
				}
				n /= x;
				if (isPrime(n)) {
					System.out.println("NO");
				}else {
					int y = 1;
					for (int i = x+1; i <= Math.sqrt(n); i++) {
						if (n % i == 0) {
							y = i;
							break;
						}
					}
					if ( y == 1) {
						System.out.println("NO");
					}else {
						int z = n/y;
						if (z == y) {
							System.out.println("NO");
						}else {
							System.out.println("YES");
							System.out.println(x + " " + y + " " + z);
						}
					}
				}
			}
		}
	}
}
