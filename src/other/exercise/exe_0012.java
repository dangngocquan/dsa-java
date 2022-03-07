//Tính giá trị của đa thức  P(x)=anxn+ an-1xn-1+ ... + a1x+ a0 theo cách tính của Horner: P(x)=((((an.x+ a(n-1))x+ a(n-2))x... + a1)x+ a0

package other.exercise;

import java.util.*;

public class exe_0012 {
	public static void main(String[] args) {
		//Input
		System.out.println("Tính giá trị của đa thức  P(x)=an.x^n + a(n-1).x^(n-1) + ... + a1.x + a0");
		System.out.print("Nhap n:\t");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n+1];
		String Px = "";
		String str = "";
		for (int i=n; i>=0;i--) {
			str += "a"+i+", ";
			if (i==0) {
				Px += "a0";
			}else if (i ==1) {
				Px += "a1.x + ";
			}else {
				Px += "a"+i+".x^"+i+" + ";
			}
		}
		str = str.substring(0,str.length()-1);
		System.out.println("Khi đó, P(x) = " + Px);
		System.out.println("Nhap cac he so "+str+ " :\t");
		for (int i = 0; i<=n; i++) {
			a[n-i] = scanner.nextInt();
		}
		String Pxx = "";
		for (int i = n; i >=0; i--) {
			if (i==0) {
				if (a[i] != 0) {
					Pxx += " + " +a[0];
				}
			}else if (i==1) {
				if (a[i] == 0) {
					Pxx +="";
				}else if (a[i] == 1) {
					Pxx += " + "+"x";
				}else {
					Pxx += " + "+a[1]+".x";
				}
			}else {
				if (a[i] == 0) {
					Pxx += "";
				}else if (a[i] == 1) {
					Pxx += " + "+ "x^"+i;
				}else {
					Pxx += " + "+ a[i]+".x^"+i;
				}
			}
		}
		Pxx = Pxx.substring(3);
		System.out.println("Khi do, P(x) = "+Pxx);
		System.out.print("Nhap x = ");
		int x = scanner.nextInt();
		scanner.close();
		//Solve
		int res = 0;
		for (int i = n; i >=0; i--) {
			res = res*x + a[i];
		}
		//Output
		System.out.println("P("+x+") = " + res);
	}
}
