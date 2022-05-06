package other.test;

import java.util.Scanner;

public class Test023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = "abcde";
        s.replaceAll("[a-e]{1}", "a");
        System.out.println(s);
    }
}
