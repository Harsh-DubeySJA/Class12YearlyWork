/**
 * Radhe Radhe
 */
public class RadheRadhe {
    interface Stack {
        void push(int data);
        int pop();
        boolean isEmpty();
    }
    static class StackOverflowException extends RuntimeException {
        public StackOverflowException() {
            super("StackDemo is full");
        }
    }
    static class StackUnderflowException extends RuntimeException {
        public StackUnderflowException() {
            super("StackDemo is empty");
        }
    }
    static class StackArray implements Stack {
        private final int[] data;
        private int top;

        public StackArray() {
            data = new int[10];
        }

        public StackArray(int size) {
            data = new int[size];
            top = -1;
        }

        public void push(int data) {
            if (top < this.data.length) this.data[++top] = data;
            else {
//                throw new RuntimeException("StackDemo is full");
                throw new StackOverflowException();
            }
        }

        public int pop() {
            if (top > -1) return data[top--];
            else {
//                throw new RuntimeException("StackDemo is empty");
                throw new StackUnderflowException();
            }
        }

        public boolean isEmpty() {
            return top == -1;
        }
    }

    public static void main(String[] args) {
        Stack stack = new StackArray();
        for (int i = 0; i < 10; i++) stack.push(i);
        while (!stack.isEmpty()) System.out.println(stack.pop());
    }
}
