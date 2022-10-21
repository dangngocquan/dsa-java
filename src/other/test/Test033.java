package other.test;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Test033 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Input
		int n = scanner.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		// Solve
		List<Integer> listIndex = new LinkedList<>();
		int sum = 0;
		for (int i = 0; i < n; i++) {
			int value1 = a[i];
			int value2 = 0;
			if (i+1 < n) {
				value2 = a[i+1];
			}
			int value3 = 0;
			if (i+2 < n) {
				value3 = a[i+2];
			}
			if (value1 + value3 <= value2) {
				listIndex.add(i+1);
				sum += a[i+1];
				i += 2;
			}else {
				listIndex.add(i);
				sum += a[i];
				i++;
			}
		}
		// Output
		System.out.println("Sum: " + sum);
		System.out.printf("%-10s: ", "Array");
		for (int i = 0; i < n; i++) {
			System.out.printf("%5d", a[i]);
		}
		System.out.println();
		System.out.printf("%-10s: ", "Result");
		for (int i = 0; i < n; i++) {
			if (listIndex.contains(i)) {
				System.out.printf("%5d", a[i]);
			}else {
				System.out.printf("%5s", "");
			}
		}
		scanner.close();
	}
}
