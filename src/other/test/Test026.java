package other.test;

public class Test026 {
	public static void change(int[] arr) {
		int[] arr1 = {4,5,6};
		arr = arr1;
	}
	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
		change(arr);
		System.out.println(arr[0]);
	}
}
