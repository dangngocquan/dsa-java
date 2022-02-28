package codeForce;

import java.util.Scanner;

public class B1343 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] a = new int[t];
		for (int i = 0; i < t;i++) {
			a[i] = scanner.nextInt();
		}
		scanner.close();
		//Output
		for (int i: a) {
			if (i%4==0) {
				System.out.println("YES");
				for (int j = 2; j <= i; j += 2) System.out.print(j +" ");
				for (int j = 1; j <= i-3; j += 2) System.out.print(j +" ");
				System.out.println(i+i/2-1);
			}else {
				System.out.println("NO");
			}
		}
	}
}

