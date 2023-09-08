package leetcode;

import java.util.LinkedList;
import java.util.List;

public class Task0118Easy {
    class Solution {
        static int[][] C;
        static int size;
        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> lists = new LinkedList<>();
            size = numRows;
            C = new int[size][size];
            fillC(0, 0);

            for (int i = 0; i < size; i++) {
                List<Integer> list = new LinkedList<>();
                for (int j = 0; j < i+1; j++) {
                    list.add(C[j][i]);
                }
                lists.add(list);
            }

            return lists;
        }

        public static void fillC(int k, int n) {
            if (n >= size) return;
            if (k == 0 || k == n) {
                C[k][n] = 1;
            } else {
                C[k][n] = C[k-1][n-1] + C[k][n-1];
            }
            if (k == n) {
                fillC(0, n+1);
            } else {
                fillC(k+1, n);
            }
        }
    }
}
