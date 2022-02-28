package CodeForce;

import java.util.Scanner;

public class A1372 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] n = new int[t];
		for (int i = 0; i < t; i++) n[i] = scanner.nextInt();
		scanner.close();
		//Output
		for (int i: n) {
			for (int j = 1; j <= i; j++) System.out.print(1+" ");
			System.out.println();
		}
	}
}
