package leetcode;

public class Task0007Medium {
    class Solution {
        public int reverse(int x) {
            String s1 = "2147483648"; // 2^31
            String s2 = "2147483647"; // 2^31 - 1

            boolean negative = x < 0;
            int n = negative? (x+"").length()-1 : (x+"").length();
            if (n < 10) {
                if (negative) {
                    x= -x;
                    return -Integer.parseInt((new StringBuilder(x+"")).reverse().toString());
                } else {
                    return Integer.parseInt((new StringBuilder(x+"")).reverse().toString());
                }
            } else {
                if (negative) {
                    x = -x;
                    String s = (new StringBuilder(x+"")).reverse().toString();
                    if (s.compareTo(s1) > 0) {
                        return 0;
                    } else {
                        return -Integer.parseInt(s);
                    }
                } else {
                    String s = (new StringBuilder(x+"")).reverse().toString();
                    if (s.compareTo(s2) > 0) {
                        return 0;
                    } else {
                        return Integer.parseInt(s);
                    }
                }

            }
        }
    }
}
