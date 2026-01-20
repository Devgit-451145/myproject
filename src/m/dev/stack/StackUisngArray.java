package m.dev.stack;

public class StackUisngArray {
    class Stack {
        private int[] arr;
        private int top;
        private int capacity;

        public Stack(int size) {
            arr = new int[size];
            capacity = size;
            top = -1;
        }

        public void push(int x) {
            if (top == capacity - 1) throw new StackOverflowError();
            arr[++top] = x;
        }

        public int pop() throws Exception {
            if (top == -1) throw new Exception();
            return arr[top--];
        }

        public int peek() throws Exception {
            if (top == -1) throw new Exception();
            return arr[top];
        }

        public boolean isEmpty() {
            return top == -1;
        }
    }
}
