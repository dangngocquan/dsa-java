package CodeForce;

import java.util.Scanner;

public class exe_B1352 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] n = new int[t];
		int[] k = new int[t];
		for (int i = 0; i < t; i++) {
			n[i] = scanner.nextInt();
			k[i] = scanner.nextInt();
		}
		scanner.close();
		//Solve + output
		for (int i = 0; i < t; i++) {
			if (n[i] %2 == 0) {
				if (k[i] %2 == 0) {
					if (n[i] >= k[i]) {
						System.out.println("YES");
						for (int j = 1; j <= k[i]-1; j++) System.out.print(1+ " ");
						System.out.println(n[i] - (k[i] - 1));
					}else {
						System.out.println("NO");
					}
				}else {
					if (n[i] >= 2*k[i]) {
						System.out.println("YES");
						for (int j = 1; j <= k[i]-1; j++) System.out.print(2+ " ");
						System.out.println(n[i] - 2*(k[i] - 1));
					}else {
						System.out.println("NO");
					}
				}
			}else {
				if (k[i] %2 == 0) {
					System.out.println("NO");
				}else {
					if (n[i] >= k[i]) {
						System.out.println("YES");
						for (int j = 1; j <= k[i]-1; j++) System.out.print(1+ " ");
						System.out.println(n[i] - (k[i] - 1));
					}else {
						System.out.println("NO");
					}
				}
			}
		}
	}
}
