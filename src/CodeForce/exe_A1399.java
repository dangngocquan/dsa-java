package CodeForce;

import java.util.Arrays;
import java.util.Scanner;

public class exe_A1399 {
	static String getResult(int n, int[] a) {
		String res = "YES";
		Arrays.sort(a);
		for (int i = 1; i < n; i++) {
			if (a[i] - a[i-1] > 1) {
				res = "NO";
				break;
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		String[] res = new String[t];
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			int[] a = new int[n];
			for (int j = 0; j < n; j++) {
				a[j] = scanner.nextInt();
			}
			res[i] = getResult(n, a);
		}
		scanner.close();
		//Output
		for (String i: res) {
			System.out.println(i);
		}
	}
}
