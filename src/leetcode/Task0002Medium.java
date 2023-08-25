package leetcode;

public class Task0002Medium {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */

    public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            // From github: @dangngocquan
            int temp = l1.val + l2.val;
            ListNode l3 = new ListNode(temp % 10);
            ListNode nodeNext = l3;
            temp /= 10;
            l1 = l1.next;
            l2 = l2.next;
            while (l1 != null || l2 != null) {
                if (l1 != null) {
                    temp += l1.val;
                    l1 = l1.next;
                }
                if (l2 != null) {
                    temp += l2.val;
                    l2 = l2.next;
                }

                nodeNext.next = new ListNode(temp % 10);
                temp /= 10;
                nodeNext = nodeNext.next;
            }

            if (temp > 0) {
                nodeNext.next = new ListNode(temp);
            }

            return l3;
        }
    }
}
