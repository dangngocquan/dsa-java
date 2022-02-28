package CodeForce;

import java.util.Scanner;

public class C1520 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] n = new int[t];
		for (int i = 0; i < t; i++) n[i] = scanner.nextInt();
		scanner.close();
		//Output
		for (int i : n) {
			if (i == 1) {
				System.out.println(1);
			}else if (i == 2) {
				System.out.println(-1);
			}else {
				int x1 = 1;
				int x2 = (int)(Math.pow(i, 2) + 1)/2 + 1;
				for (int j = 1; j <= i; j++) {
					if (j%2==1) {
						for (int k = 1; k <= i; k++) {
							if (k%2 == 1) {
								System.out.print(x1+ " ");
								x1++;
							}else {
								System.out.print(x2 + " ");
								x2++;
							}
						}
						System.out.println();
					}else {
						for (int k = 1; k <= i; k++) {
							if (k%2 == 1) {
								System.out.print(x2+ " ");
								x2++;
							}else {
								System.out.print(x1 + " ");
								x1++;
							}
						}
						System.out.println();
					}
				}
			}
		}
	}
}
