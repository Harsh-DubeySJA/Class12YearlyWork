import java.util.Scanner;

public class NestedBrackets {

    interface Stack {
        void push(char ch);
        char pop();
        boolean isEmpty();
    }

    static class OverflowException extends RuntimeException {
        public OverflowException() {
            super("Overflow: No memory");
        }
    }

    static class UnderflowException extends RuntimeException {
        public UnderflowException() {
            super("Underflow: No elements left");
        }
    }

    static class StackLinked implements Stack {
        static class Node {
            char ch;
            Node next;

            public Node(char ch) {
                this.ch = ch;
            }
        }
        private Node top;

        public void push(char ch) {
            try {
                Node newNode = new Node(ch);
                newNode.next = top;
                top = newNode;
            } catch (OutOfMemoryError e) {
                throw new OverflowException();
            }
        }

        public char pop() {
            char ch;
            if (!isEmpty()) {
                ch = top.ch;
                top = top.next;
            } else {
                throw new UnderflowException();
            }
            return ch;
        }

        public boolean isEmpty() {
            return top == null;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack characterStack = new StackLinked();
        System.out.print("Enter the Expression: ");
        String expression = sc.nextLine();
        boolean isPrecedenceCorrect = true;
        String brackets = "{[(}])";
        for (int i = 0, indexPosition; i < expression.length(); i++) {
            indexPosition = brackets.indexOf(expression.charAt(i));

            if (indexPosition != -1) {
                if (indexPosition < 3) characterStack.push(expression.charAt(i));
                else if (characterStack.isEmpty() || characterStack.pop() != brackets.charAt(indexPosition-3 )) {
                        isPrecedenceCorrect = false;
                        break;
                }
            }

        }

        if (!isPrecedenceCorrect || !characterStack.isEmpty())
            System.out.println(expression + " is invalid");
        else
            System.out.println(expression + " is valid");
        sc.close();
    }
}
