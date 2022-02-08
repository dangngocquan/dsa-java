package CodeForce;

import java.util.Scanner;

public class exe_A233 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		//Output
		if (n%2==1) {
			System.out.println(-1);
		}else {
			for (int i = 1; i <= n; i++) {
				if (i%2==1) {
					System.out.print((i+1) + " ");
				}else {
					System.out.print((i-1) + " ");
				}
			}
		}
	}
}
