package leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;

public class Task1326Hard {
    class Solution {
        public int minTaps(int n, int[] ranges) {
            int[] maxFar = new int[n+1];
            for (int i = 0; i <= n; i++) {
                int start = i - ranges[i];
                if (start < 0) start = 0;
                int end = i + ranges[i];
                maxFar[start] = end;
            }


            int count = 0;
            int tempIndex = 0;
            int nextIndex = 0;
            for (int i = 0; i <= n; i++) {
                if (i > nextIndex) return -1;
                if (i > tempIndex) {
                    tempIndex = nextIndex;
                    count++;
                }
                if (maxFar[i] > nextIndex) nextIndex = maxFar[i];
            }

            return count;
        }
    }
}
