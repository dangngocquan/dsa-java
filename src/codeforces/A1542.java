package codeforces;

import java.util.Scanner;

public class A1542 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		String[] res = new String[t];
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			int evenCount = 0;
			int oddCount = 0;
			for (int j = 1; j <= 2*n; j++) {
				if (scanner.nextInt()%2==0) {
					evenCount++;
				}else {
					oddCount++;
				}
			}
			if (evenCount == oddCount) {
				res[i] = "Yes";
			}else {
				res[i] = "No";
			}
		}
		scanner.close();
		//Output
		for (String i : res) System.out.println(i);
	}
}
