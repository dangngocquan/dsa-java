package luyencode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class VT14 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		List<Integer> negativeNumberList = new ArrayList<Integer>();
		List<Integer> positiveNumberList = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			int x = scanner.nextInt();
			if (x < 0) {
				negativeNumberList.add(x);
			}else {
				positiveNumberList.add(x);
			}
		}
		scanner.close();
		//Solve
		int max;
		Collections.sort(negativeNumberList);
		Collections.sort(positiveNumberList);
		int size1 = negativeNumberList.size();
		int size2 = positiveNumberList.size();
		if (size1 == 1 && size2 == 1) {
			max = negativeNumberList.get(0)*positiveNumberList.get(0);
		}else {
			int max1 = Integer.MIN_VALUE;
			int max2 = Integer.MIN_VALUE;
			if (size1 >= 2) max1 = negativeNumberList.get(size1-1)*negativeNumberList.get(size1-2);
			if (size2 >= 2) max2 = positiveNumberList.get(size2 - 1)*positiveNumberList.get(size2-2);
			max = Math.max(max1, max2);
		}
		//Output
		System.out.println(max);
	}
}
