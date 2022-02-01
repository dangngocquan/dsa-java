package CodeForce;

import java.util.Scanner;

public class exe_A432 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (scanner.nextInt()<=5-k) count++;
		}
		scanner.close();
		//Output
		System.out.println(count/3);
	}
}
