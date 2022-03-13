package luyenCode;

import java.util.Scanner;

// Not AC with Java, but AC with Cpp
public class SANGNT {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		if (n <= 1) {
			System.out.println("");
			return;
		}
		boolean[] prime = new boolean[n+1];
		prime[0] = true;
		prime[1] = true;
		for (int i = 2; i <= n; i++) {
			if (!prime[i]) {
				System.out.print(i + " ");
				for (int j = 2*i; j <= n; j += i) {
					prime[j] = true;
				}
			}
		}
	}
}

// Source Cpp
//#include <iostream>
//
//using namespace std;
//
//int main() {
//    int n;
//    cin >> n;
//    if (n > 1) {
//        bool isPrime[1000001];
//        for (int i = 2; i <= n; i++) isPrime[i] = true;
//        for (int i = 2; i <= n; i++) {
//            if (isPrime[i]) {
//                cout << i << " ";
//                for (int j = 2*i; j <= n; j += i) isPrime[j] = false;
//            }
//        }
//    }
//}

