import java.util.Scanner;

public class ThreeRealNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Write appropriate statement
        System.out.println("Enter three real Numbers");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float absoluteA = Math.abs(a);
        float absoluteB = Math.abs(b);
        float absoluteC = Math.abs(c);
        a -= absoluteA;
        b -= absoluteB;
        c -= absoluteC;
        float product = absoluteA * absoluteB * absoluteC;
        float sum = a + b + c;
        float ans = product / sum;
        System.out.println("x = " + ans);
        sc.close();
    }
}
