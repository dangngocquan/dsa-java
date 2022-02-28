package CodeForce;

import java.util.Scanner;

public class C1462 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] x = new int[t];
		for (int i = 0; i < t; i++) {
			x[i] = scanner.nextInt();
		}
		scanner.close();
		//Solve
		String[] ans = new String[51];
		for (int i = 46; i <=50; i++) ans[i] = "-1";
		for (int i = 45; i <= 45; i++) ans[i] = "123456789";
		for (int i = 43; i <= 44; i++) ans[i] = (i-42) + "3456789";
		for (int i = 40; i <= 42; i++) ans[i] = (i-39)+"456789";
		for (int i = 36; i <= 39; i++) ans[i] = (i-35)+"56789";
		for (int i = 31; i <= 35; i++) ans[i] = (i-30)+"6789";
		for (int i = 25; i <= 30; i++) ans[i] = (i-24)+"789";
		for (int i = 18; i <= 24; i++) ans[i] = (i-17)+"89";
		for (int i = 10; i <= 17; i++) ans[i] = (i-9)+"9";
		for (int i = 1; i <= 9; i++) ans[i] = i + "";
		//Output
		for (int i : x) System.out.println(ans[i]);
	}
}
