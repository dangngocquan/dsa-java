package CodeForce;

import java.util.Scanner;

public class exe_A1363 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		String[] ans = new String[t];
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			int x = scanner.nextInt();
			int evenCount = 0;
			int oddCount = 0;
			for (int j = 0; j < n; j++) {
				if (scanner.nextInt() % 2 == 1) {
					oddCount++;
				}else {
					evenCount++;
				}
			}
			ans[i] = "Yes";
			if (oddCount==0) {
				ans[i] = "No";
			}else {
				int k1 = (oddCount%2==0) ? oddCount-1: oddCount;
				while (k1 > x) k1 -= 2;
				if (evenCount<x-k1) ans[i] = "No";
			}
			
		}
		scanner.close();
		//Output
		for (String i : ans) System.out.println(i);
	}
}
