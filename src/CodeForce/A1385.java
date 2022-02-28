package CodeForce;

import java.util.Arrays;
import java.util.Scanner;

public class A1385 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		String[] res = new String[t];
		for (int i = 0; i < t; i++) {
			int[] x = new int[3];
			x[0] = scanner.nextInt();
			x[1] = scanner.nextInt();
			x[2] = scanner.nextInt();
			res[i] = "";
			int max = Math.max(Math.max(x[0], x[1]),x[2]);
			int min = Math.min(Math.min(x[0], x[1]),x[2]);
			Arrays.sort(x);
			if (x[1] != max) {
				res[i] = "NO";
			}else {
				res[i] = "YES\n" + max + " " + min + " " + 1;
			}
		}
		scanner.close();
		//Output
		for (String i : res) System.out.println(i);
	}
}
