package leetcode;

public class Task0707Medium {
    public class MyLinkedList {
        private LinkedListNode<Integer> head;
        private int n;

        public MyLinkedList() {

        }

        public int get(int index) {
            LinkedListNode<Integer> node = getNode(index);
            if (node == null) return -1;
            return node.value;
        }

        public LinkedListNode<Integer> getNode(int index) {
            if (index < 0 || index >= n) {
                return null;
            }
            LinkedListNode node = head;
            while (index-- > 0) {
                node = node.next;
            }
            return node;
        }

        public void addAtHead(int val) {
            LinkedListNode<Integer> node = new LinkedListNode<>();
            node.value = val;
            node.next = head;
            head = node;
            n++;
        }

        public void addAtTail(int val) {
            LinkedListNode<Integer> node = new LinkedListNode<>();
            node.value = val;
            if (n == 0) {
                head = node;
            } else {
                getNode(n-1).next = node;
            }
            n++;
        }

        public void addAtIndex(int index, int val) {
            if (index < 0 || index > n) return;
            if (index == n) {
                addAtTail(val);
                return;
            }
            if (index == 0) {
                addAtHead(val);
                return;
            }
            LinkedListNode<Integer> node = new LinkedListNode<>();
            node.value = val;
            node.next = getNode(index);
            getNode(index-1).next = node;
            n++;
        }

        public void deleteAtIndex(int index) {
            if (index < 0 || index >= n) return;
            if (index == 0) {
                head = getNode(1);
                n--;
                return;
            }
            if (index == n-1) {
                getNode(n-2).next = null;
                n--;
                return;
            }
            getNode(index-1).next = getNode(index+1);
            n--;
        }

        private class LinkedListNode<T> {
            T value;
            LinkedListNode next;
        }
    }
}
