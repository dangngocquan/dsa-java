package codePTIT;

import java.util.Scanner;

public class J01024 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            String s = scanner.next();
            System.out.println(
                    s.matches("[012]{1,}")? "YES" : "NO"
            );
        }
    }
}
