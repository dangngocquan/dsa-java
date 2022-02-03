package CodeForce;

import java.util.Scanner;

public class exe_A1475 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		String[] res = new String[t];
		for (int i = 0; i < t; i++) {
			long n = scanner.nextLong();
			res[i] = "NO";
			if (n%2==1) {
				res[i] = "YES";
			}else {
				while (n>1) {
					n /= 2;
					if (n%2==1 && n>1) {
						res[i] = "YES";
						break;
					}
				}
			}
		}
		scanner.close();
		//Output
		for (String i : res) {
			System.out.println(i);
		}
	}
}
