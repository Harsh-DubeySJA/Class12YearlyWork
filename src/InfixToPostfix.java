import java.util.Scanner;

public class InfixToPostfix {

    interface Stack {
        void push(char ch);
        char pop();
        boolean isEmpty();
    }

    static class StackLinked implements Stack {
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
                throw new RuntimeException("Overflow: Out of Memory");
            }
        }

        public char pop() {
            char ch;
            if (!isEmpty()) {
                ch = top.ch;
                top = top.next;
            } else {
                throw new RuntimeException("Underflow: No element left");
            }
            return ch;
        }

        public boolean isEmpty() {
            return (top == null);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InfixToPostfix conversion = new InfixToPostfix();
        String infixExpression = sc.next();
        String postfixExpression = conversion.postfixConversion(infixExpression);
//        Testing
//        String postfixExpression = conversion.postfixConversion("4$2+3-3+8/4(1+1)");
        System.out.println(postfixExpression);
        sc.close();
    }

    private String postfixConversion(String infixExpression) {
        Stack characterStack = new StackLinked();
        String postfixExpression = "";
        String operators = "()$*/+-";
        for (int i = 0; i < infixExpression.length(); i++) {
            char ch = infixExpression.charAt(i);
            int index = operators.indexOf(ch);
            if (index != -1) {
                if (ch == '(') continue;
                if (ch == ')') while (!characterStack.isEmpty()) postfixExpression+=characterStack.pop();
                else if (!characterStack.isEmpty()) {
                    char pop = characterStack.pop();
                    int newIndex = operators.indexOf(pop);
                    if (checkHierarchy(newIndex, index)) {
                        characterStack.push(ch);
                        postfixExpression+=pop;
                    } else {
                        characterStack.push(pop);
                        characterStack.push(ch);
                    }
                } else
                    characterStack.push(ch);
            } else postfixExpression+=ch;
        }
        return postfixExpression;
    }

    private boolean checkHierarchy(int newIndex, int index) {
        // Checks for higher order of precedence
        // In the operator String higher precedence operators are placed first
        return (newIndex < index+2);
    }
}
