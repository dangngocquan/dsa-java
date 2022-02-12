package CodeForce;

import java.util.Scanner;

public class exe_A1549 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] p = new int[t];
		for (int i = 0; i < t; i++) p[i] = scanner.nextInt();
		scanner.close();
		//Output
		for (int i = 0; i < t; i++) {
			if (p[i] == 5) {
				System.out.println(2+ " " +4);
				continue;
			}
			System.out.println(2 + " " + p[i]/2);
		}
	}
}
