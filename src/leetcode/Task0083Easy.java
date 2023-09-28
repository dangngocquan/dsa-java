package leetcode;

public class Task0083Easy {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            ListNode currentNode = head;
            ListNode previousNode = null;
            while (currentNode != null) {
                if (previousNode != null && previousNode.val == currentNode.val) {
                    previousNode.next = currentNode.next;
                } else {
                    previousNode = currentNode;
                }
                currentNode = currentNode.next;
            }
            return head;
        }
    }
}
