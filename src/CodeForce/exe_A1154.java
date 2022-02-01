package CodeForce;

import java.util.Arrays;
import java.util.Scanner;

public class exe_A1154 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int[] x = new int[4];
		for (int i = 0; i < 4; i++) {
			x[i] = scanner.nextInt();
		}
		scanner.close();
		//Solve
		Arrays.sort(x);
		//Output
		for (int i = 0; i < 3; i++) {
			System.out.print((x[3] - x[i]) + " ");
		}
	}
}
