package leetcode;

public class Task1359Hard {
    class Solution {
        public int countOrders(int n) {
            long[] counts = new long[n+1];
            counts[1] = 1;
            for (int i = 2; i <= n; i++) {
                int slot = (i-1) * 2 + 1;
                counts[i] = counts[i-1] * (slot * (slot+1) / 2) % 1000000007;
            }
            return (int) counts[n];
        }
    }
}
