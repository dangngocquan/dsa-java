package codeforces;

import java.util.Scanner;

public class B1831 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] count1 = new int[2*n+1];
            int[] count2 = new int[2*n+1];
            int tempValue = 0;
            int tempLength = 0;
            for (int i = 0; i <= n; i++) {
                int value = 0;
                value = (i < n)? scanner.nextInt() : 0;
                if (value == tempValue) {
                    tempLength++;
                } else {
                    count1[tempValue] = Math.max(count1[tempValue], tempLength);
                    tempValue = value;
                    tempLength = 1;
                }
            }
            tempValue = 0;
            tempLength = 0;
            for (int i = 0; i <= n; i++) {
                int value = 0;
                value = (i < n)? scanner.nextInt() : 0;
                if (value == tempValue) {
                    tempLength++;
                } else {
                    count2[tempValue] = Math.max(count2[tempValue], tempLength);
                    tempValue = value;
                    tempLength = 1;
                }
            }
            int ans = 0;
            for (int i = 1; i < 2*n+1; i++) {
                ans = Math.max(ans, count1[i] + count2[i]);
            }
            System.out.println(ans);
        }
    }
}
