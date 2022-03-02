package luyenCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class VT02 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Set<Integer> set = new TreeSet<Integer>();
		for (int i = 0; i < n; i++) set.add(scanner.nextInt());
		scanner.close();
		//Output
		List<Integer> list = new ArrayList<Integer>();
		for (int i : set) list.add(i);
		if (list.size() >= 2) {
			System.out.println(list.get(list.size()-2));
		}else {
			System.out.println("NOT FOUND");
		}
	}
}
