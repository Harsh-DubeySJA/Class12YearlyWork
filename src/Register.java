import java.util.Arrays;
import java.util.Scanner;

public class Register {
    private String[] stud;
    private int cap;
    private int top;

    public Register(int max) {
        cap = max;
        top = -1;
        stud = new String[cap];
    }

    private void push(String n) {
        if (top < cap - 1) {
            stud[++top] = n;
        } else {
            System.out.println("OVERFLOW");
        }
    }

    private String pop() {
        if (top > -1) {
            return stud[top--];
        } else {
            return "$$";
        }
    }

    private void display() {
        System.out.println(Arrays.toString(stud));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Register register = new Register(5);
        register.push("Harsh");
        register.push("Kajal");
        System.out.println(register.pop());
        register.display();
        sc.close();
    }
}
