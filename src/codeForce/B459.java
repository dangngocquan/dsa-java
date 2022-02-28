package codeForce;

import java.util.Scanner;

public class B459 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int countMin = 1;
		int countMax = 1;
		for (int i = 1; i <= n; i++) {
			int x = scanner.nextInt();
			if (x == min) {
				countMin++;
			}else if (x < min) {
				min = x;
				countMin = 1;
			}
			if (x == max) {
				countMax++;
			}else if (x > max) {
				max = x;
				countMax = 1;
			}
		}
		scanner.close();
		//Solve
		
		//Output
		if (max == min) {
			System.out.println((max - min) + " " + (long)(countMax)*(long)(countMax-1)/2);
		}else {
			System.out.println((max - min) + " " + (((long)(countMax)) * ((long)(countMin))));
		}
		
	}
}
