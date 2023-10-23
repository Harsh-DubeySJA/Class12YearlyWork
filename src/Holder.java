import java.util.Arrays;
import java.util.Scanner;

public class Holder {
    private int[] Q;
    private int cap;
    private int front;
    private int rear;

    public Holder(int n) {
        cap = n;
        Q = new int[cap];
        front = 0;
        rear = 0;
    }

    private void addint(int v) {
        if (rear < cap) {
            Q[rear++] = v;
        } else {
            System.out.println("HOLDER IS FULL");
        }
    }

    private int removeint() {
        if (rear > 0) {
            return Q[front++];
        } else {
            return -999;
        }
    }

    private void show() {
        System.out.println(Arrays.toString(Q));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Length of Holder : ");
        int n = sc.nextInt();
        System.out.println("Elements of holder");
        Holder holder = new Holder(n);
        for (int i = 0; i < n; i++) {
            holder.addint(sc.nextInt());
        }
        holder.show();
        holder.removeint();
        holder.show();
        sc.close();
    }
}
