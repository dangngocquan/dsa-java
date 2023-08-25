package leetcode;

public class Task0004Hard {
    class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            // From github: @dangngocquan
            int n1 = nums1.length;
            int n2 = nums2.length;
            if (n1 == 0) {
                double median2 = (n2 % 2 == 0)? (nums2[n2/2] + nums2[n2/2-1]) * 0.5 : nums2[n2/2];
                return median2;
            }
            if (n2 == 0) {
                double median1 = (n1 % 2 == 0)? (nums1[n1/2] + nums1[n1/2-1]) * 0.5 : nums1[n1/2];
                return median1;
            }

            int n = n1 + n2;

            int index1 = 0;
            int index2 = 0;
            int prevValue = 0;
            int tempValue = 0;
            while (index1 + index2 <= n/2) {
                prevValue = tempValue;
                if (index1 < n1) {
                    if (index2 < n2) {
                        if (nums1[index1] <= nums2[index2]) {
                            tempValue = nums1[index1];
                            index1++;
                        } else {
                            tempValue = nums2[index2];
                            index2++;
                        }
                    } else {
                        tempValue = nums1[index1];
                        index1++;
                    }
                } else {
                    tempValue = nums2[index2];
                    index2++;
                }
            }

            return (n%2 == 0)? (prevValue + tempValue) * 0.5 : tempValue;
        }
    }
}
