public class StackDemo {
    interface Stack {
        void push(int data);
        int pop();
        boolean isEmpty();
    }
    static class StackLinked implements Stack{
        class Node {
            int data;
            Node next;

//            int[] garbage;
            public Node(int data) {
                this.data = data;
//                garbage = new int[9999999];
            }
        }

        private Node top;
        public StackLinked() {
            top = null;
        }

        public void push(int data) {
            try {
                Node newNode = new Node(data);
                newNode.next = top;
                top = newNode;
            } catch (OutOfMemoryError e) {
                throw new RuntimeException("Overflow");
            }
        }

        public int pop() {
            int data;
            if (!isEmpty()) {
                data = top.data;
                top = top.next;
            } else {
                throw new RuntimeException("Underflow");
            }
            return data;
        }

        public boolean isEmpty() {
            return top == null;
        }
    }

    public static void main(String[] args) {
        Stack stack = new StackLinked();
        for (int i = 0; i <= 5; i++) {
            stack.push(i);
        }
        while (!stack.isEmpty()) System.out.println(stack.pop());
//        System.out.println(stack.pop());
        while (true) {
            stack.push(100);
        }
    }
}
