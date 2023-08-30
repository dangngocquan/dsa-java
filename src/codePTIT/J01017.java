package codePTIT;

import java.util.Scanner;

public class J01017 {
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
        int n = s.length();
        for (int i = 0; i < n-1; i++) {
            int value = s.charAt(i) - s.charAt(i+1);
            if (value != -1 && value != 1) return "NO";
        }
        return "YES";
    }
}
