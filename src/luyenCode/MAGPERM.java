package luyenCode;

import java.util.Scanner;

public class MAGPERM {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		scanner.close();
		if (k==0) {
			for (int i = 1; i <= n; i++) System.out.print(i + " ");
		}else if (k > ((n%2==0)? n/2 : (n-1)/2)) {
			System.out.println(-1);
		}else {
			if (n % (2*k) != 0) {
				System.out.println(-1);
			}else {
				int x = n/k/2;
				for (int i = 0; i < x; i++) {
					int start = i*2*k;
					int end = i*2*k+2*k;
					for (int j = start+k+1; j <= end; j++) System.out.print(j + " ");
					for (int j = start+1; j <= start + k; j++) System.out.print(j + " ");
				}
			}
		}
	}
}
