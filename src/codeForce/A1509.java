package codeForce;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A1509 {
	public static void main(String[] args) {
		//Input + Output
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-->0) {
			int n = scanner.nextInt();
			List<Integer> oddList = new ArrayList<Integer>();
			List<Integer> evenList = new ArrayList<Integer>();
			while (n-->0) {
				int x = scanner.nextInt();
				if (x % 2 == 0) {
					evenList.add(x);
				}else {
					oddList.add(x);
				}
			}
			for (int i : oddList) System.out.print(i + " ");
			for (int i : evenList) System.out.print(i + " ");
			System.out.println();
		}
		scanner.close();
	}
}
