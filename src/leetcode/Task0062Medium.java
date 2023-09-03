package leetcode;

public class Task0062Medium {
    class Solution {
        public int uniquePaths(int m, int n) {
            int max = Math.max(m-1, n-1);
            int min = Math.min(m-1, n-1);
            return C(max + min, min);
        }

        public static int C(int n, int k) {
            long k0 = Math.min(n-k, k);
            long ans = 1;
            for (long i = 1; i <= k0; i++) {
                ans *= (n - k0 + i);
                ans /= i;
            }
            return (int) ans;
        }
    }
}
