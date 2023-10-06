package leetcode;

public class Task0622Medium {
    class MyCircularQueue {
        private int[] data;
        private int size;
        private int firstIndex;

        public MyCircularQueue(int k) {
            data = new int[k];
        }

        public boolean enQueue(int value) {
            if (size == data.length) return false;
            data[(firstIndex + size) % data.length] = value;
            size++;
            return true;
        }

        public boolean deQueue() {
            if (size == 0) return false;
            firstIndex = (firstIndex + 1) % data.length;
            size--;
            return true;
        }

        public int Front() {
            if (size == 0) return -1;
            return data[firstIndex];
        }

        public int Rear() {
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
