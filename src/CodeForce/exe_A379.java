package CodeForce;

import java.util.Scanner;

public class exe_A379 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		scanner.close();
		//Solve
		int res = 0;
		int count = 0;
		while (a>0) {
			res++;
			a--;
			count++;
			if (count == b) {
				count = 0;
				a++;
			}
		}
		//Output
		System.out.println(res);
	}
}
