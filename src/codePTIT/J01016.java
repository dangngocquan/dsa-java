package codePTIT;

import java.util.Scanner;

public class J01016 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println(solve(s));
    }

    public static String solve(String s) {
        if (s.length() < 4) return "NO";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '4' || c == '7') count++;
            if (count > 7) break;
        }
        return (count == 4 || count == 7)? "YES" : "NO";
    }
}
