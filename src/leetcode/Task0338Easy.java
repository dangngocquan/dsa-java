package leetcode;

public class Task0338Easy {
    class Solution {
        public int[] countBits(int n) {
            int[] ans = new int[n+1];
            ans[0] = 0;
            int length = 1;
            int count = 0;
            for (int i = 1; i <= n; i++) {
                if (count == length) {
                    length = length << 1;
                    count = 0;
                }
                ans[i] = ans[i-length] + 1;
                count++;
            }
            return ans;
        }
    }
}
