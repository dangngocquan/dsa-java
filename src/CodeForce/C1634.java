package CodeForce;

import java.util.Scanner;

public class C1634 {
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
		//Output
		for (int i = 0; i < t; i++) {
			if (k[i] == 1) {
				System.out.println("YES");
				for (int j = 1; j <= n[i]; j++) {
					System.out.println(j);
				}
			}else {
				if (n[i] %2 == 1) {
					System.out.println("NO");
				}else {
					System.out.println("YES");
					for (int j = 1; j <= n[i]*k[i]/2; j++) {
						System.out.print((j*2-1) + " " );
						if (j %k[i] == 0) System.out.println();
					}
					for (int j = 1; j <= n[i]*k[i]/2; j++) {
						System.out.print((j*2) + " " );
						if (j %k[i] == 0) System.out.println();
					}
				}
			}
		}
	}
}
