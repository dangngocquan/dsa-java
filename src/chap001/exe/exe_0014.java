//Nhập số liệu cho  dãy số thực  a0 , a1 ,..., an-1 . Hãy liệt kê các phần tử  xuất hiện trong dãy đúng một lần.

package chap001.exe;

import java.util.*;

public class exe_0014 {
	public static void main(String[] args) {
		//Input
		System.out.println("Day so thuc a0, a1, ..., a(n-1)");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap n = ");
		int n = scanner.nextInt();
		List<Double> list = new ArrayList<Double>();
		System.out.println("Nhap cac so a0, a1, ..., a"+(n-1)+ ":");
		for (int i = 0; i < n; i++) {
			list.add(scanner.nextDouble());
		}
		scanner.close();
		//Solve
		//Output
		System.out.print("Cac so xuat hien 1 lan la:\t");
		for (double i: list) {
			if (Collections.frequency(list, i)==1) {
				System.out.print(i+"  ");
			}
		}
	}
}
