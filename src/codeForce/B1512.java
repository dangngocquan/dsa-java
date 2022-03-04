package codeForce;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B1512 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] size = new int[t];
		List<Integer>[] location = new ArrayList[t];
		for (int i = 0; i < t; i++) {
			size[i] = scanner.nextInt();
			location[i] = new ArrayList<Integer>();
			for (int j = 0; j < size[i]; j++) {
				char[] c = scanner.next().toCharArray();
				for (int k = 0; k < size[i]; k++) {
					if (c[k] == '*') {
						location[i].add(j);
						location[i].add(k);
					}
				}
			}
			// locate[i] = {row1, column1, row2, column2};
			int row1 = location[i].get(0);
			int column1 = location[i].get(1);
			int row2 = location[i].get(2);
			int column2 = location[i].get(3);
			if (row1 == row2) {
				if (row1 == 0) {
					location[i].add(1);
					location[i].add(column1);
					location[i].add(1);
					location[i].add(column2);
				}else {
					location[i].add(row1-1);
					location[i].add(column1);
					location[i].add(row2-1);
					location[i].add(column2);
				}
			}else if (column1 == column2) {
				if (column1 == 0) {
					location[i].add(row1);
					location[i].add(1);
					location[i].add(row2);
					location[i].add(1);
				}else {
					location[i].add(row1);
					location[i].add(column1-1);
					location[i].add(row2);
					location[i].add(column2-1);
				}
			}else {
				location[i].add(row1);
				location[i].add(column2);
				location[i].add(row2);
				location[i].add(column1);
			}
			// locate[i] = {row1, column1, row2, column2, row3, column3, row4, column4};
		}
		scanner.close();
		//Output
		for (int i = 0; i < t; i++) {
			for (int j = 0; j < size[i]; j++) {
				for (int k = 0; k < size[i]; k++) {
					if ((j==location[i].get(0) && k == location[i].get(1)) || (j==location[i].get(2) && k == location[i].get(3)) || (j==location[i].get(4) && k == location[i].get(5)) || (j==location[i].get(6) && k == location[i].get(7))) {
						System.out.print('*');
					}else {
						System.out.print('.');
					}
				}
				System.out.println();
			}
		}
	}
}
