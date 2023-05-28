package codePTIT;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		scanner.close();
		
		int[] scores = new int[n];
		int tempIndex = 0;
		int counter = 1;
		
		while (tempIndex < n) {
			if (scores[tempIndex] < k) {
				System.out.printf("Turn %3d:	", counter);
				int tempValue = n-1;
				for (int i = 0; i < n; i++) {
					if (i != tempIndex) {
						scores[i] += tempValue;
						System.out.printf("%5d ", tempValue);
						tempValue--;
					}else {
						scores[i] += n;
						System.out.printf("%5d ", n);
					}
				}
				System.out.println();
				counter++;
			} else {
				tempIndex++;
			}
		}	
	}
}
