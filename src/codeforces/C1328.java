package codeforces;

import java.util.Scanner;

public class C1328 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] n = new int[t];
		String[] x = new String[t];
		for (int i = 0; i < t; i++) {
			n[i] = scanner.nextInt();
			x[i] = scanner.next();
		}
		scanner.close();
		//Output
		for (int i = 0; i < t; i++) {
			int indexDifferent = -1;
			for (int j = 0; j < n[i]; j++) {
				if (x[i].charAt(j) == '2' || x[i].charAt(j) == '0') {
					System.out.print((x[i].charAt(j) - '0')/2);
				}else {
					System.out.print(1);
					indexDifferent = j;
					break;
				}
			}
			if (indexDifferent>0) {
				for (int j = indexDifferent+1; j < n[i]; j++) System.out.print(0);
			}
			System.out.println();
			if (indexDifferent > 0) {
				for (int j = 0; j <= indexDifferent; j++) System.out.print((x[i].charAt(j) -'0')/2);
				for (int j = indexDifferent + 1; j < n[i]; j++) System.out.print(x[i].charAt(j));
			}else {
				for (int j = 0; j < n[i]; j++) System.out.print((x[i].charAt(j) - '0')/2);
			}
			System.out.println();
		}
	}
}
