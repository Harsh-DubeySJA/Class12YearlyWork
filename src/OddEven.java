import java.util.Scanner;

public class OddEven {
    private int[] a;
    private int m;
    private static int base = -1;

    public OddEven(int mm) {
        m = mm;
        a = new int[m];
    }

    private void fillarray() {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < m; i++) {
            a[i] = in.nextInt();
            if (a[i] % 2 == 0) base++;
        }
    }

    public static OddEven arrange(OddEven P, OddEven Q) {
        OddEven result = new OddEven(P.m + Q.m);
        int front = 0;
        for (int i = 0; i < P.m; i++) {
            if (P.a[i] % 2 == 0) {
                result.a[base++] = P.a[i];
            } else {
                result.a[front++] = P.a[i];
            }
        }
        for (int i = 0; i < Q.m; i++) {
            if (Q.a[i] % 2 == 0) {
                result.a[base++] = Q.a[i];
            } else {
                result.a[front++] = Q.a[i];
            }
        }
        return result;
    }

    private void display() {
        System.out.print(a[0]);
        for (int i = 1; i < m; i++) {
            System.out.print(" " + a[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Elements : ");
        OddEven a = new OddEven(sc.nextInt());
        OddEven b = new OddEven(sc.nextInt());
        a.fillarray();
        b.fillarray();
        OddEven c = OddEven.arrange(a, b);
        c.display();
        sc.close();
    }
}
