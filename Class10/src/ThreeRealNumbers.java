import java.util.Scanner;

public class ThreeRealNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Write appropriate statement
        System.out.println("Enter three real Numbers");
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        double absoluteA = Math.abs(a), absoluteB = Math.abs(b), absoluteC = Math.abs(c);
        a -= absoluteA;
        b -= absoluteB;
        c -= absoluteC;
        double product = absoluteA * absoluteB * absoluteC;
        double sum = a + b + c;
        double ans = product / sum;
        System.out.println("x = " + ans);
        sc.close();
    }
}
