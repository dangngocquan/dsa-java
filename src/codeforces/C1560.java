package codeforces;

import java.util.Scanner;

public class C1560 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] n = new int[t];
		for (int i = 0; i < t; i++) n[i] = scanner.nextInt();
		scanner.close();
		//Solve + Output
		for (int i : n) {
			int size = (int)(Math.floor(Math.sqrt(i)));
			i -= size*size;
			int r,c;
			if (i == 0) {
				r = size;
				c = 1;
			}else {
				i--;
				r = 1;
				c = size+1;
				while (i > 0) {
					if (r < size +1) {
						r++;
						i--;
					}else {
						c--;
						i--;
					}
				}
			}
			System.out.println(r + " " + c);
		}
	}
}
