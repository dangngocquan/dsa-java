package luyenCode;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class VT16 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		List<Integer> negativeNumberList = new LinkedList<Integer>();
		int x;
		do {
			x = scanner.nextInt();
			if (x < 0) negativeNumberList.add(x);
		} while (x != 0);
		scanner.close();
		//Output
		for (int i : negativeNumberList) System.out.print(i + " ");
		if (negativeNumberList.isEmpty()) System.out.println("NOT FOUND");
	}
}
