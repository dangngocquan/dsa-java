package leetcode;

public class Task0641Medium {
    class MyCircularDeque {
        private int[] data;
        private int firstIndex;
        private int size;

        public MyCircularDeque(int k) {
            data = new int[k];
        }

        public boolean insertFront(int value) {
            if (size == data.length) return false;
            firstIndex = (firstIndex - 1 + data.length) % data.length;
            data[firstIndex] = value;
            size++;
            return true;
        }

        public boolean insertLast(int value) {
            if (size == data.length) return false;
            data[(firstIndex + size) % data.length] = value;
            size++;
            return true;
        }

        public boolean deleteFront() {
            if (size == 0) return false;
            firstIndex = (firstIndex + 1) % data.length;
            size--;
            return true;
        }

        public boolean deleteLast() {
            if (size == 0) return false;
            size--;
            return true;
        }

        public int getFront() {
            if (size == 0) return -1;
            return data[firstIndex];
        }

        public int getRear() {
            if (size == 0) return -1;
            return data[(firstIndex + size - 1) % data.length];
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public boolean isFull() {
            return size == data.length;
        }
    }
}
