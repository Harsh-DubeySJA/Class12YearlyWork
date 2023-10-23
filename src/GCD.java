import java.util.Scanner;

public class GCD {
    private static int gcdRecursive(int a, int b) {
        if (a == 0 || b == 0) {
            return Math.max(a, b);
        }
        return b > a ? gcdRecursive(a, b - a) : gcdRecursive(a - b, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A = ");
        int a = sc.nextInt();
        System.out.print("B = ");
        int b = sc.nextInt();
        System.out.println(gcdRecursive(a, b));
        sc.close();
    }
}
