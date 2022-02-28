package CodeForce;

import java.util.Scanner;

public class A1370 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] res = new int[t];
		for (int i = 0; i < t; i++) {
			res[i] = scanner.nextInt()/2;
		}
		scanner.close();
		//Output
		for (int i : res) {
			System.out.println(i);
		}
	}
}
