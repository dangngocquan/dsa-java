package CodeForce;

import java.util.Arrays;
import java.util.Scanner;

public class exe_A1622 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		String[] ans = new String[t];
		for (int i = 0; i < t; i++) {
			int[] l = new int[3];
			l[0] = scanner.nextInt();
			l[1] = scanner.nextInt();
			l[2] = scanner.nextInt();
			ans[i] = "NO";
			if ((l[0]+l[1]+l[2])%2==0) {
				Arrays.sort(l);
				if (l[0] == l[1] || l[1] == l[2] || l[0] + l[1] == l[2]) {
					ans[i] = "YES";
				}
			}
		}
		scanner.close();
		//Output
		for (String i : ans) System.out.println(i);
	}
}
