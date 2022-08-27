package codeforces;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class A1721 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            String s1 = scanner.next();
            String s2 = scanner.next();
            Set<Character> s = new LinkedHashSet<>();
            s.add(s1.charAt(0));
            s.add(s1.charAt(1));
            s.add(s2.charAt(0));
            s.add(s2.charAt(1));
            System.out.println(s.size() - 1);
        }
        scanner.close();
    }
}
