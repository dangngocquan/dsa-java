package leetcode;

public class Task2366Hard {
    class Solution {
        public long minimumReplacement(int[] nums) {
            int length = nums.length;
            int temp = nums[length-1];
            long count = 0;
            for (int i = length-2; i >= 0; i--) {
                if (nums[i] > temp) {
                    if (nums[i] % temp == 0) {
                        count += nums[i] / temp - 1;
                    } else {
                        int n = nums[i] / temp;
                        count += n;
                        temp = nums[i] /(n+1);
                    }
                } else {
                    temp = nums[i];
                }
            }
            return count;
        }
    }
}
