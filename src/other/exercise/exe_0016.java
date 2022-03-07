//Nhập số liệu  cho dãy số thực  a0 , a1 ,..., an-1 . In ra màn hình số lần xuất hiện của các phần tử.

package other.exercise;

import java.util.*;

public class exe_0016 {
	public static void main(String[] args) {
		List<Double> list = new ArrayList<Double>();
		Set<Double> set = new LinkedHashSet<Double>();
		//Input
		System.out.println("Day so a0, a1, ..., a(n-1)");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap n:\t");
		int n = scanner.nextInt();
		System.out.println("Nhap cac so thuc a0, ..., a"+(n-1));
		for (int i = 0; i < n; i++) {
			double x = scanner.nextDouble();
			list.add(x);
			set.add(x);
		}
		scanner.close();
		//Solve + Output
		System.out.println("So lan xuat hien cua cac phan tu:");
		for (double i: set) {
			System.out.printf("%-15s : %-2s lan.\n",i,Collections.frequency(list, i));
		}
	}
}
