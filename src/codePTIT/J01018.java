package codePTIT;

import java.util.Scanner;

public class J01018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        StringBuilder sb = new StringBuilder("");
        while (t-- > 0) {
            String s = scanner.next();
            sb.append(solve(s)).append("\n");
        }
        System.out.println(sb.toString());
        scanner.close();
    }

    public static String solve(String s) {
        int sum = s.charAt(0) - '0';
        int n= s.length();
        for (int i = 1; i < n; i++) {
            int value = s.charAt(i) - s.charAt(i-1);
            if (value != 2 && value != - 2) return "NO";
            sum += s.charAt(i) - '0';
        }

        return (sum % 10 == 0)? "YES" : "NO";
    }
}
