package CodeForce;

import java.util.Scanner;

public class A1388 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] n = new int[t];
		for (int i = 0; i < t; i++) n[i] = scanner.nextInt();
		scanner.close();
		//Solve + Output
		for (int i : n) {
			if (i >= 31) {
				if ((i-30) != 6 && (i-30) != 10 && (i-30) != 14) {
					System.out.println("YES");
					System.out.println(6 + " " + 10 + " " + 14 + " " + (i - 30));
				}else {
					System.out.println("YES");
					System.out.println(6 + " " + 10 + " " + 15 + " " + (i - 31));
				}
			}else {
				System.out.println("NO");
			}
 		}
	}
}
