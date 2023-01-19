package other.test;

import java.util.Arrays;

public class Test034 {
	public static void main(String[] args) {
		Numberr num1 = new Numberr("33");
		Numberr num2 = new Numberr("2");
		System.out.println(Numberr.product(num1, num2));
	}
	
	
}

class Numberr {
		public int[] digits;
		
		public Numberr(String str) {
			int n = str.length();
			this.digits = new int[n];
			for (int i = 0; i < str.length(); i++) {
				digits[i] = str.charAt(n-1-i) - '0';
			}
		}
		
		public Numberr(int n) {
			digits = new int[n];
			Arrays.fill(digits, 0);
		}
		
		public String toString() {
			String ans = "";
			for (int i : digits) {
				ans = i + "" + ans;
			}
			return ans;
		}
		
		public static Numberr product(Numberr num1, Numberr num2) {
			int n1 = num1.toString().length();
			int n2 = num2.toString().length();
			Numberr ans = new Numberr(n1+n2);
			
			for (int i = 0; i < n1; i++) {
				for (int j = 0; j < n2; j++) {
					ans.digits[i+j] += num1.digits[i]*num2.digits[j];
				}
			}
			
			for (int i = 0; i < n1+n2 - 1; i++) {
				int temp = ans.digits[i]/10;
				ans.digits[i] %= 10;
				ans.digits[i+1] += temp;
			}
			
			return ans;
		}
	}