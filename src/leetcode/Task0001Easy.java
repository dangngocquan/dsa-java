package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Task0001Easy {
    public static int[] twoSum(int[] nums, int target) {
        List<Integer> l = new ArrayList<>();
        for (int e : nums) l.add(e);
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int i1 = l.lastIndexOf(target - nums[i]);
            if (i1 > i) {
                return new int[] {i, i1};
            }
        }
        return new int[] {-1, -1};
    }

    public static void main(String[] args) {
        int[] nums = {3, 3};
        int target = 6;
        int[] ans = twoSum(nums, target);
        System.out.println(ans[0] + " " + ans[1]);
    }
}
