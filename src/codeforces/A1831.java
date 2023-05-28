package codeforces;

import java.util.Scanner;

public class A1831 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.print((n+1 - scanner.nextInt()) + " ");
            }
            System.out.println();
        }
    }
}
