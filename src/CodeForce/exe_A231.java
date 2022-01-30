package CodeForce;

import java.util.Scanner;

public class exe_A231 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int res = 0;
		for (int i= 0; i < n; i++) {
			int count = 0;
			for (int j = 0; j < 3; j++) {
				if (scanner.nextInt()==1) count++;
			}
			if (count >= 2) res++;
		}
		scanner.close();
		//Output
		System.out.println(res);
	}
}
