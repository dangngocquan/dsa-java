//Nhập số liệu cho  dãy số thực  a0 , a1 ,..., an-1. Hãy liệt kê các phần tử  xuất hiện trong dãy đúng 2 lần.

package other.exercise;

import java.util.*;

public class exe_0015_c2 {
	public static void main(String[] args) {
		Map<Double,Integer> map = new LinkedHashMap<Double,Integer>();
		//Input
		System.out.println("Day so thuc a0, a1, ..., a(n-1)");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap n = ");
		int n = scanner.nextInt();
		System.out.println("Nhap cac so a0, a1, ..., a"+(n-1)+ ":");
		for (int i = 0; i < n; i++) {
			double x = scanner.nextDouble();
			if (map.containsKey(x) == false) {
				map.put(x,1);
			}
			else {
				map.replace(x, map.get(x), map.get(x)+1);
			}
		}
		scanner.close();
		//Solve
		//Output
		System.out.print("Cac so xuat hien 2 lan la:\t");
		for (double i: map.keySet()) {
			if (map.get(i) == 2) {
				System.out.print(i+ " ");
			}
		}
	}
}
