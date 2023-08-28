package leetcode;

public class Task0006Medium {
    class Solution {
        public String convert(String s, int numRows) {
            if (numRows == 1) return s;
            StringBuilder[] sbs = new StringBuilder[numRows];
            for (int i = 0; i < numRows; i++) sbs[i] = new StringBuilder("");

            int n = s.length();
            int rowIndex = 0;
            int direction = 1;
            for (int i = 0; i < n; i++) {
                sbs[rowIndex].append(s.charAt(i));
                int nextIndex = rowIndex + direction;
                if (nextIndex < 0 || nextIndex >= numRows) {
                    direction = -direction;
                }
                rowIndex += direction;
            }

            StringBuilder ans = new StringBuilder("");
            for (StringBuilder sb : sbs) ans.append(sb);
            return ans.toString();
        }
    }
}
