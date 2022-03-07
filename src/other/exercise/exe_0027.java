//Bài 27. Viết chương trình nhập vào vào mảng A có n phần tử, các phần tử là những số nguyên lớn hơn 0 và nh�? hơn 100 được nhập vào từ bàn phím. Thực hiện các chức năng sau:
//a)	Tìm phần tử lớn nhất và lớn thứ 2 trong mảng cùng chỉ số của các số đó.
//b)	Sắp xếp mảng theo thứ tự giảm dần .
//c)	Nhập một số nguyên x và chèn x vào mảng A sao cho vẫn đảm bảo tính sắp xếp giảm dần.

package other.exercise;

import java.util.*;

public class exe_0027 {
	static void show(int i) {
		if (i ==0) {
			System.out.print("It is the " + (i+1) + "st element.");
		}else if ( i==1) {
			System.out.print("It is the " + (i+1) + "nd element.");
		}else if (i==2) {
			System.out.print("It is the " + (i+1) + "rd element.");
		}else {
			System.out.print("It is the " + (i+1) + "th element.");
		}
	}
	
	static int[] getTheLargestValue(int[] A) {
		int[] res = new int[2];
		res[0] = -100000000;
		for (int i = 0; i < A.length; i++) {
			if (A[i] > res[0]) {
				res[0] = A[i];
				res[1] = i;
			}
		}
		return res;
	}
	
	static int[] getTheSecondLargestValue(int[] A) {
		int[] res = new int[2];
		res[0] = -100000000;
		int max = getTheLargestValue(A)[0];
		for (int i = 0; i < A.length; i++) {
			if (A[i] < max && A[i] > res[0]) {
				res[0] = A[i];
				res[1] = i;
			}
		}
		return res;
	}
	
	static int[] getTheReverseOfArray(int[] A) {
		int[] B = new int[A.length];
		for (int i = 0; i < B.length; i++) {
			B[i] = A[A.length-i-1];
		}
		return B;
	}
	
	static String getStringOfArray(int[] A) {
		String str = "";
		for (int i : A) {
			str += String.format("%3d", i);
		}
		return str;
	}
	
	static int[] getArrayAfterAddX(int[] A, int x) {
		int[] B = new int[A.length + 1];
		boolean used = false;
		for (int i = 0; i < A.length; i++) {
			if (used == false) {
				if (x <= A[i]) {
					B[i] = A[i];
				}else {
					B[i] = x;
					used = true;
					i--;
				}
			}else {
				B[i+1] = A[i];
			}
		}
		return B;
	}
	
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		System.out.print("Array A has n elements. Please enter n = ");
		int n = scanner.nextInt();
		int[] A = new int[n];
		for (int i = 0; i < n; i++) {
			if (i ==0) {
				System.out.print("Please enter the value of the " + (i+1) + "st element (1-99):\t");
			}else if ( i==1) {
				System.out.print("Please enter the value of the " + (i+1) + "nd element (1-99):\t");
			}else if (i==2) {
				System.out.print("Please enter the value of the " + (i+1) + "rd element (1-99):\t");
			}else {
				System.out.print("Please enter the value of the " + (i+1) + "th element (1-99):\t");
			}
			A[i] = scanner.nextInt();
		}
		System.out.println("============================================================================================");
		//Solve + Output
		// a)
		System.out.println("a)");
		int[] arr11 = getTheLargestValue(A);
		System.out.println("  + The largest element: " + arr11[0]);
		System.out.print("    ");
		show(arr11[1]);
		System.out.println();
		int[] arr12 = getTheSecondLargestValue(A);
		System.out.println("  + The second largest element: " + arr12[0]);
		System.out.print("    ");
		show(arr12[1]);
		System.out.println();
		// b)
		System.out.println("b) Sort array A.");
		Arrays.sort(A);
		A = getTheReverseOfArray(A);
		System.out.println("   Result: "+ getStringOfArray(A));
		// c)
		System.out.println("c) Add x to array A.");
		System.out.print("   Please enter the value of x = ");
		int x = scanner.nextInt();
		scanner.close();
		A = getArrayAfterAddX(A, x);
		System.out.println("   Result: " + getStringOfArray(A));
	}
}
