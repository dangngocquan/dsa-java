package CodeForce;

import java.util.Scanner;

public class exe_A1634 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] res = new int[t];
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			int k = scanner.nextInt();
			String s = scanner.next();
			if (k<1) {
				res[i] = 1;
			}else {
				boolean isReverse = true;
				for (int j = 0; j < n; j++) {
					if (s.charAt(j) != s.charAt(n-1-j)) {
						isReverse = false;
						break;
					}
				}
				if (isReverse) {
					res[i] = 1;
				}else {
					res[i] = 2;
				}
			}
		}
		scanner.close();
		//Output
		for (int i : res) System.out.println(i);
	}
}
