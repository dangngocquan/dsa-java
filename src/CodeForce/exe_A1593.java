package CodeForce;

import java.util.Scanner;

public class exe_A1593 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] a = new int[t];
		int[] b = new int[t];
		int[] c = new int[t];
		for (int i = 0; i < t; i++) {
			a[i] = scanner.nextInt();
			b[i] = scanner.nextInt();
			c[i] = scanner.nextInt();
		}
		scanner.close();
		//Solve + Output
		for (int i = 0; i < t; i++) {
			int max = Math.max(a[i], b[i]);
			max = Math.max(max, c[i]);
			int count = 0;
			if (a[i] == max) count++;
			if (b[i] == max) count++;
			if (c[i] == max) count++;
			String ans = "";
			if (count == 1) {
				ans += (a[i]==max) ? "0 " : ((max+1 - a[i])+" ");
				ans += (b[i]==max) ? "0 " : ((max+1 - b[i])+" ");
				ans += (c[i]==max) ? "0 " : ((max+1 - c[i])+" ");
			}else {
				ans += (max+1-a[i]) + " " + (max+1-b[i]) + " "+ (max+1-c[i]) + " ";
			}
			System.out.println(ans);
		}
	}
}
