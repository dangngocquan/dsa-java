//Bài 24. Viết chương trình nhập vào vào ma trận A có n dòng, m cột, các phần tử là những số nguyên lớn hơn 0 và nhỏ hơn 100 được nhập vào từ bàn phím. 
//Thực hiện các chức năng sau:
//a)	Tìm phần tử lớn nhất của ma trận cùng chỉ số của số đó.
//b)	Tìm và in ra các phần tử là số nguyên tố của ma trận (các phần tử không nguyên tố thì thay bằng số 0).
//c)	Sắp xếp tất cả các cột của ma trận theo thứ tự tăng dần và in kết quả ra màn hình.

package chap001.exe;

import java.util.*;

public class exe_0024 {
	static int[] getMaxValueAndLocate(int[][] A) {
		int[] res = new int[3];
		res[0] = A[0][0];
		res[1] = 1;
		res[2] = 1;
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j <A[0].length; j++) {
				if (A[i][j] > res[0]) {
					res[0] = A[i][j];
					res[1] = i+1;
					res[2] = j+1;
				}
			}
		}
		return res;
	}
	
	static boolean isPrime(int n) {
		boolean check = true;
		for (int i = 2; i <= (int)Math.sqrt(n); i++) {
			if (n%i==0) {
				check = false;
				break;
			}
		}
		if (n==1) check = false;
		return check;
	}
	
	static int[][] getPrimeMatrix(int[][] A) {
		int[][] B = new int[A.length][A[0].length];
		for (int i = 0; i < B.length; i++) {
			for (int j = 0; j < B[0].length; j++) {
				if (isPrime(A[i][j])) {
					B[i][j] = A[i][j];
				}
				else {
					B[i][j] = 0;
				}
			}
		}
		return B;
	}
	
	static String getStringOfMatrix(int[][] A) {
		String str = "";
		for (int i = 0; i < A.length; i++) {
			str += "\t\t";
			for (int j = 0; j <A[0].length; j++) {
				str += String.format("%4d",A[i][j]);
			}
			str += "\n";
		}
		return str;
	}
	
	static int[][] getSortOfMatrix(int[][] A) {
		for (int j = 0; j <A[0].length; j++) {
			int[] arr = new int[A.length];
			for (int i = 0; i <A.length; i++) {
				arr[i] = A[i][j];
			}
			Arrays.sort(arr);
			for (int i = 0; i < A.length; i++) {
				A[i][j] = arr[i];
			}
		}
		return A;
	}
	
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Matrix A has n rows, m columns.");
		System.out.print("Total rows n = ");
		int n = scanner.nextInt();
		System.out.print("Total columns m = ");
		int m = scanner.nextInt();
		int[][] A = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print("The value of row " + (i+1) + ", column " + (j+1) + " (1-99). A["+(i+1)+"]["+(j+1)+"] = ");
				A[i][j] = scanner.nextInt();
			}
		}
		System.out.println("Your matrix: ");
		System.out.println(getStringOfMatrix(A));
		System.out.println("======================================================");
		scanner.close();
		//Solve + Output
		// a)
		long begin = Calendar.getInstance().getTimeInMillis();
		System.out.println("a)	Tìm phần tử lớn nhất của ma trận cùng chỉ số của số đó.");
		int[] res = getMaxValueAndLocate(A);
		System.out.println("   Result: ");
		System.out.println("\tMax value: " + res[0]);
		System.out.println("\tLocation: A[" + res[1] + "][" +res[2]+"]");
		// b)
		System.out.println("b)	Tìm và in ra các phần tử là số nguyên tố của ma trận (các phần tử không nguyên tố thì thay bằng số 0).");
		int[][] B = getPrimeMatrix(A);
		System.out.println("   Result: ");
		System.out.println(getStringOfMatrix(B));
		System.out.println();
		System.out.println(getStringOfMatrix(A));
		// c)
		System.out.println("c)	Sắp xếp tất cả các cột của ma trận theo thứ tự tăng dần và in kết quả ra màn hình.");
		System.out.println("Result: ");
		System.out.println(getStringOfMatrix(getSortOfMatrix(A)));
		long end = Calendar.getInstance().getTimeInMillis();
		System.out.printf("Runtime:\t%dms",(end-begin));
	}
}
