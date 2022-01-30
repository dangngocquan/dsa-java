package chap001.test;

public class test0001 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 3;
		arr[4]= 4;
		for (int i: arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println(get(2,arr));
		for (int i: arr) {
			System.out.print(i+" ");
		}
	}
	static int get(int i, int[] arr) {
		arr[0] = 100;
		return arr[i];
	}
}
