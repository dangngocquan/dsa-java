package luyenCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exe_PTTS {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong();
		scanner.close();
		//Solve + Output
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i <= Math.sqrt(n)+1; i++) {
			list.add(0);
		}
		System.out.println(list.size());
	}
}
