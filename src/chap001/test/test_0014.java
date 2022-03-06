package chap001.test;

import java.util.Arrays;

public class test_0014 {
	public static void main(String[] args) {
		long[] a = new long[4];
		a[0] = 3;
		a[1] = 2;
		a[2] = 1;
		System.out.println("Before: ");
		for (long i: a) System.out.print(i + " ");
		System.out.println();
		Arrays.sort(a);
		System.out.println("After: ");
		for (long i: a) System.out.print(i + " ");
	}
}
