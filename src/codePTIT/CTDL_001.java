package codePTIT;

import java.util.Scanner;

public class CTDL_001 {
	public static int[] bits;
	public static boolean isOdd;
	
	public static void solve(int indexFinding) {
		if (indexFinding > bits.length-1) {
			printBits();
		}else {
			bits[indexFinding] = 0;
			solve(indexFinding+1);
			bits[indexFinding] = 1;
			solve(indexFinding+1);
		}
	}
	
	public static void printBits() {
		if (isOdd) {
			for (int i = 0; i < bits.length; i++) {
				System.out.print(bits[i] + " ");
			}
			System.out.print(0 + " ");
			for (int i = bits.length-1; i >= 0; i--) {
				System.out.print(bits[i] + " ");
			}
			System.out.println();
			
			for (int i = 0; i < bits.length; i++) {
				System.out.print(bits[i] + " ");
			}
			System.out.print(1 + " ");
			for (int i = bits.length-1; i >= 0; i--) {
				System.out.print(bits[i] + " ");
			}
			System.out.println();
		}else {
			for (int i = 0; i < bits.length; i++) {
				System.out.print(bits[i] + " ");
			}
			for (int i = bits.length-1; i >= 0; i--) {
				System.out.print(bits[i] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		bits = new int[n/2];
		isOdd = n%2 != 0;
		solve(0);
		scanner.close();
	}
}
