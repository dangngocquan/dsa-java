//Nhập số n và dãy các số thực  a0 , a1 ,..., an-1.
//Không đổi chỗ các phần tử và không dùng thêm mảng số thực nào khác (có thể dùng mảng số nguyên nếu cần) hãy cho hiện trên màn hình dãy trên theo thứ tự tăng dần.

package chap001.exe;

import java.util.*;

public class exe_0017 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap n:\t");
		int n = scanner.nextInt();
		System.out.println("Nhap cac so thuc a0, ..., a"+(n-1));
		double[] arr = new double[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextDouble();
		}
		scanner.close();
		//Solve + Output
		double min = -1000000000;
		int index = -1;
		System.out.print("In day theo thu tu tang dan: ");
		for (int i=0; i<n;i++) {
			boolean check = false;
			for (int j = 0; j < n; j++) {
				if (arr[j] == min && j > index) {
					check = true;
					index = j;
					break;
				}
			}
			if (check) {
				System.out.print(min + "  ");
				continue;
			}
			
			double res = 0;
			for (int j = 0; j < n; j++) {
				if (arr[j]>min) {
					res = arr[j];
					index = j;
					break;
				}
			}
			for (int j = 0; j < n; j++) {
				if (arr[j] > min && arr[j] < res) {
					res = arr[j];
					index = j;
				}
			}
			min = res;
			System.out.print(res+"  ");
			
		}
	}
}
