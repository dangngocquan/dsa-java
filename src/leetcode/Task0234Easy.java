package leetcode;

public class Task0234Easy {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    class Solution {
        public boolean isPalindrome(ListNode head) {
            ListNode node = head;
            int n = 0;
            while (node != null) {
                n++;
                node = node.next;
            }
            int mid = (n-1) / 2;
            ListNode[] nodes = new ListNode[mid+1];
            node = head;
            int index = 0;
            while (node != null) {
                if (index <= mid) {
                    nodes[index] = node;
                } else {
                    if (node.val != nodes[n - 1 - index].val) return false;
                }
                node = node.next;
                index++;
            }
            return true;
        }
    }
}
