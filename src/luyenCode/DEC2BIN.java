package luyenCode;

import java.util.Scanner;
import java.util.Stack;

public class DEC2BIN {
	static void solve(long x) {
		Stack<Long> stack = new Stack<Long>();
		while (x > 0) {
			stack.add(x%2);
			x /= 2;
		}
		while (!stack.isEmpty()) System.out.print(stack.pop());
		System.out.println();
	}
	
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		long[] n = new long[t];
		for (int i = 0; i < t; i++) n[i] = scanner.nextLong();
		scanner.close();
		//Output
		for (long i : n) solve(i);
	}
}
