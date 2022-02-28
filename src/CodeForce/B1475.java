package CodeForce;

import java.util.Scanner;

public class B1475 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		String[] res = new String[t];
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			// n = a.2020 + b.2021 
			res[i] = "NO";
			for (int j = 0; j <= n/2021; j++) {
				int k = n - 2021*j;
				if (k%2020==0) {
					res[i] = "YES";
					break;
				}
			}
		}
		scanner.close();
		//Output
		for (String i: res) {
			System.out.println(i);
		}
	}
}
