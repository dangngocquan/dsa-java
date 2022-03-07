//Nhập số liệu cho  dãy số thực  a0 , a1 ,..., an-1. Hãy liệt kê các phần tử  xuất hiện trong dãy đúng 2 lần.

package other.exercise;

import java.util.*;

public class exe_0015_c1 {
	public static void main(String[] args) {
		//Input
		System.out.println("Day so thuc a0, a1, ..., a(n-1)");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap n = ");
		int n = scanner.nextInt();
		List<Double> list = new ArrayList<Double>();
		System.out.println("Nhap cac so a0, a1, ..., a"+(n-1)+ ":");
		for (int i = 0; i < n; i++) {
			list.add(scanner.nextDouble());
		}
		scanner.close();
		//Solve
		Set<Double> set = new LinkedHashSet<Double>();
		//Output
		System.out.print("Cac so xuat hien 2 lan la:\t");
		for (double i: list) {
			if (Collections.frequency(list, i)==2) {
				set.add(i);
			}
		}
		for (double i: set) {
			System.out.print(i+"  ");
		}
	}
}
