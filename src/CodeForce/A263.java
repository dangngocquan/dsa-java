package CodeForce;

import java.util.Scanner;

public class A263 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int a = 0;
		int b = 0;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				int x = scanner.nextInt();
				if (x==1) {
					a = i;
					b = j;
				}
			}
		}
		scanner.close();
		//Output
		System.out.println(Math.abs(a-3) + Math.abs(b-3));
	}
}
