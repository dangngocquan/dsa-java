package codeforces;

import java.util.Scanner;

public class B1721 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int d = scanner.nextInt();
            int x1 = x - d;
            int x2 = x + d;
            int y1 = y - d;
            int y2 = y + d;
            if ((x1 > 1 && y2 < m) || (x2 < n && y1 > 1)) {
                System.out.println(n + m - 2);
            }else {
                System.out.println(-1);
            }
        }
        scanner.close();
    }
}
