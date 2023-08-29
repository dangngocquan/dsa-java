package leetcode;

public class Task2483Medium {
    class Solution {
        public int bestClosingTime(String customers) {
            int n = customers.length();
            int[] penalties = new int[n+1];
            for (int i = 0; i < n; i++) {
                if (customers.charAt(i) == 'Y') penalties[0]++;
            }
            for (int i = 1; i <= n; i++) penalties[i] = penalties[i-1] + (customers.charAt(i-1) == 'Y'? -1 : 1);

            int min = n;
            int index = 0;
            for (int i = 0; i <= n; i++) {
                if (penalties[i] < min) {
                    min = penalties[i];
                    index = i;
                }
            }

            return index;
        }
    }
}
