import java.util.Scanner;

interface Stack {
    void push(char ch);
    char pop();
    boolean isEmpty();
}

class OverflowException extends RuntimeException {
    public OverflowException() {
        super("Overflow: Out of Memory");
    }
}

class UnderflowException extends RuntimeException {
    public UnderflowException() {
        super("Underflow: No element left");
    }
}

class StackLinked implements Stack {

    class Node {
        char ch;
        Node next;

        public Node(char ch) {
            this.ch = ch;
        }
    }

    private Node top;
    public StackLinked() {
        top = null;
    }

    public void push(char ch) {
        try {
            Node newNode = new Node(ch);
            newNode.next = top;
            top = newNode;
        } catch (OutOfMemoryError e) {
            throw new RuntimeException("Overflow: No memory");
//            throw new UnderflowException();
        }
    }

    public char pop() {
        char ch;
        if (!isEmpty()) {
            ch = top.ch;
            top = top.next;
        } else {
            throw new RuntimeException("Underflow");
//            throw new UnderflowException();
        }
        return ch;
    }

    public boolean isEmpty() {
        return top == null;
    }
}

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack stack = new StackLinked();
        System.out.print("Enter a String : ");
        String input = sc.next();
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }
        String output = "";
        while (!stack.isEmpty())
            output += stack.pop();
        System.out.println("Reversed String: " + output);
        /* Printing Directly to the console
            System.out.print("Reversed String: ");
            while (!stack.isEmpty())
                System.out.print(stack.pop());
         */
        sc.close();
    }
}
