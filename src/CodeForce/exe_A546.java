package CodeForce;

import java.util.Scanner;

public class exe_A546 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();
		int n = scanner.nextInt();
		int w = scanner.nextInt();
		scanner.close();
		//Solve
		long res = (long)(k*w*(w+1)/2 - n);
		if (res < 0) res = 0;
		//Output
		System.out.println(res);
	}
}
