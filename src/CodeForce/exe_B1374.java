package CodeForce;

import java.util.Scanner;

public class exe_B1374 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] res = new int[t];
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			res[i] = 0;
			while (n > 1) {
				if (n%3 !=0) {
					res[i] = -1;
					break;
				}else {
					if (n%6 == 0) {
						n /= 6;
						res[i]++;
					}else {
						n *= 2;
						res[i]++;
					}
				}
			}
		}
		scanner.close();
		//Output
		for (int i : res) {
			System.out.println(i);
		}
	}
}
